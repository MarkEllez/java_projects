package project_11;


class MyThread implements Runnable {
    String Thrdname;

    MyThread (String name) {
        Thrdname = name;
    }

    public void run () {
        System.out.print("Запуск потока " + Thrdname);

        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + Thrdname + ", counter " + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(Thrdname + "прерван");
        }
        System.out.println(Thrdname + "завершение");

    }
}

public class UseThreads {
    public static void main (String args[]){
        System.out.println("Запуск основного потока: ");

        MyThread mt = new MyThread("Child #1");  //создаем объект класса, который реализует интерфейс Runnable

        Thread newThrd = new Thread(mt);  //создание потока на основе объекта класса, который реализует интерфейс Runnable

        newThrd.start();   // запуск потока на выполнение


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
