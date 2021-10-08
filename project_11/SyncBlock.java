package project_11;

class SumArray1 {
    private int sum;

    int sumArray (int nums[]){                               //МЕТОД НЕ СИНХРОНИЗИРОВАН
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }
        }
        return sum;
    }
}

class MyThread8 implements Runnable {
    Thread thrd;
    int a[];
    static SumArray1 sa = new SumArray1();
    int answer;


    MyThread8 (String name, int nums[]){
        a = nums;
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {

        System.out.println("Запуск " + thrd.getName());
        synchronized (sa) {                                         //БЛОК СИНХРОНИЗАЦИИ
            answer = sa.sumArray(a);
        }

        System.out.println("Сумма для " + thrd.getName() + ": " + answer);

        System.out.println("Завершение " + thrd.getName());
    }
}


public class SyncBlock {
    public static void main (String args[]){
        int a[] = {1, 2, 3, 4, 5};

        MyThread8 mt1 = new MyThread8("Child#1", a);
        MyThread8 mt2 = new MyThread8("Child#2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException e){
            System.out.println("Прерывание основного потока");
        }
    }
}
