package project_11;

class MyThreads5 implements Runnable {
    Thread thrd;

    MyThreads5 (String name) {
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


public class MoreAliveThreads {
    public static void main (String args[]){
        System.out.println("Запуск основного потока");

        MyThreads5 mt = new MyThreads5("Child #1");
        MyThreads5 mt2 = new MyThreads5("Child #2");
        MyThreads5 mt3 = new MyThreads5("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }
        while ( mt.thrd.isAlive() ||
                mt2.thrd.isAlive()||
                mt3.thrd.isAlive()
        );
        System.out.println("Завершение основного потока");
    }
}