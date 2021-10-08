package project_11;

class MyThreads2 implements Runnable {
    Thread thrd;

    MyThreads2 (String name){
        thrd = new Thread(this, name);
        thrd.start();                           //старт дочернего потока
}

    public void run(){
        System.out.println(thrd.getName() + " - запуск");

        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);

                System.out.println("В " + thrd.getName() + ", счетчик " + count);
            }
        }
        catch (InterruptedException exc){
           System.out.println(thrd.getName() + " прерван");
        }

        System.out.println(thrd.getName() + " завершение");
    }
}


public class UseThreadsImproved {
    public static void main (String args[]){
        System.out.println("Запуск основного потока ");

        MyThreads2 mt = new MyThreads2("Child #1");

        for (int i = 0; i < 50; i++){
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
