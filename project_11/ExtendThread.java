package project_11;

class MyThreads3 extends Thread {

    MyThreads3 (String name){
        super(name);          //переопределение конструктора класса Thread
        start();                           //старт дочернего потока
    }

    public void run(){
        System.out.println(getName() + " - запуск");

        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);

                System.out.println("В " + getName() + ", счетчик " + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(getName() + " прерван");
        }

        System.out.println(getName() + " завершение");
    }
}


public class ExtendThread {
    public static void main (String args[]){
        System.out.println("Запуск основного потока ");

        MyThreads3 mt = new MyThreads3("Child #1");

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
