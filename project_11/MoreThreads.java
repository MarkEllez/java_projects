package project_11;

class MyThreads4 implements Runnable {
    Thread thrd;

    MyThreads4 (String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        System.out.println("Запуск " + thrd.getName());

        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ". счетчик" + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание потока " + thrd.getName());
        }
        System.out.println("Завершение потока " + thrd.getName());
    }
}


public class MoreThreads {
    public static void main (String args[]){
        System.out.println("Запуск основного потока");

        MyThreads4 mt = new MyThreads4("Child #1");
        MyThreads4 mt2 = new MyThreads4("Child #2");
        MyThreads4 mt3 = new MyThreads4("Child #3");

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
