package project_11;

class MyThread10 implements Runnable {
    Thread thrd;

    volatile boolean suspended;   //ПРИОСТАНОВКА ПОТОКА ПРИ ЗНАЧЕНИИ TRUE
    volatile boolean stopped;     //ОСТАНОВКА ПОТОКА ПРИ ЗНАЧЕНИИ TRUE

    MyThread10 (String name){
        thrd = new Thread(this, name);  //создание потока на основе объекта класса, который реализует интерфейс Runnable
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run() {
        System.out.println("Запуск " + thrd.getName());

        try {
            for (int i = 1; i < 1000; i++){
                System.out.print(i + " ");
                if ((i%10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this){
                    while (suspended){
                        wait();
                    }
                    if (stopped) break;
                }

            }
        }
        catch (InterruptedException exc){
            System.out.println(thrd.getName() + "прерван");
        }

        System.out.println(thrd.getName() + "завершен");

    }

    synchronized void myStop(){                            //ОСТАНОВИТЬ ПОТОК
        stopped = true;

        suspended = false;
        notify();
    }

    synchronized void mySuspend() {                        //ПРИОСТАНОВИТЬ ПОТОК
        suspended = true;
    }

    synchronized void myResume() {                         //ВОЗОБНОВИТЬ ПОТОК
        suspended = false;
        notify();
    }

}


public class Suspend {
    public static void main (String args[]){
        MyThread10 ob1 = new MyThread10("My Thread");

        try {
            Thread.sleep(1000);                      //ПОЗВОЛИТЬ ПОТОКУ ob1 НАЧАТЬ ВЫПОЛНЕНИЕ
            ob1.mySuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myStop();
            System.out.println("Остановка потока");

        }
        catch (InterruptedException exc){
            System.out.println("Прерывание освновного потока");
        }

        try {                                             //ОЖИДАНИЕ ЗАВЕРШЕНИЯ ПОТОКА
            ob1.thrd.join();
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        System.out.println("Выход из основного потока");

    }
}
