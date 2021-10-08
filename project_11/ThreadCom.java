package project_11;

class TickTock {
    String state;

    synchronized void tick (boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");

        state = "ticked";
        notify();                                   //ПОЗВОЛИТЬ ВЫПОЛНЯТЬСЯ МЕТОДУ TOCK

        try {
            while (!state.equals("tocked")){        //МЕТОД TICK ОЖИДАЕТ ЗАВЕРШЕНИЯ МЕТОДА TOCK
                wait();
            }
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock (boolean running){

        if(!running){
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        state = "tocked";
        notify();                                //ПОЗВОЛИТЬ ВЫПОЛНЯТЬСЯ МЕТОДУ TICK

        try {
            while (!state.equals("ticked")){
                wait();                          //МЕТОД TOCK ОЖИДАЕТ КОНЦА ЗАВЕРШЕНИЯ МЕТОДА TICK
            }
        }
        catch (InterruptedException ex) {
            System.out.println("Прерывание потока");
        }
    }
}


class Mythreads9 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    Mythreads9 (String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();                               //ЗАПУСК ПОТОКА
    }

    public void run(){
        if(thrd.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
                ttOb.tick(false);
            }
        }
        else {
            for (int i = 0; i < 5; i++){
                ttOb.tock(true);

                ttOb.tock(false);
            }
        }
    }
}


public class ThreadCom {
    public static void main (String args[]){
        TickTock tt = new TickTock();
        Mythreads9 mt1 = new Mythreads9("Tick", tt);
        Mythreads9 mt2 = new Mythreads9("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание основного потока");
        }
    }
}
