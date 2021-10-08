package project_11;

class MyThreads6 implements Runnable {
    Thread thrd;

    MyThreads6 (String name) {
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


public class JoinThreads {
    public static void main (String args[]){
        System.out.println("Запуск основного потока");

        MyThreads6 mt = new MyThreads6 ("Child #1");
        MyThreads6 mt2 = new MyThreads6("Child #2");
        MyThreads6 mt3 = new MyThreads6("Child #3");


            try {
                mt.thrd.join();
                System.out.println("Child#1 присоединен");
                mt2.thrd.join();
                System.out.println("Child#2 присоединен");
                mt3.thrd.join();
                System.out.println("Child#3 присоединен");
            }
            catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }


        System.out.println("Завершение основного потока");
    }
}