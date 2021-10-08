package project_11;

class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0;

        for (int i =0; i <nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы " + Thread.currentThread().getName() + ": " + sum);


            try {
                Thread.sleep(1);         //разрешить переключение задач
            } catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }
        return sum;
    }
}

class MyThread7 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThread7 (String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();                               //запуск потока
    }

    public void run(){
        int sum;

        System.out.println("Запуск " + thrd.getName());

        answer = sa.sumArray(a);

        System.out.println("СУММА для " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - завершение");
    }
}


public class Sync {
    public static void main (String args[]){
        int a[] = {1,2,3,4,5};
        MyThread7 mt1 = new MyThread7("Child#1", a);
        MyThread7 mt2 = new MyThread7("Child#2", a);

    }
}
