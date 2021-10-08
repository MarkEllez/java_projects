package project_12;

enum TrafficLightColor1 {
    RED(1000), YELLOW(200), GREEN(500);

    private int col;

    TrafficLightColor1 (int c) {
        col = c;
    }

    int getDelay(){
        return col;
    }


}

class TrafficLightSimulator1 implements Runnable {
    private Thread thrd;             //поток для имитации светофора (регулирует состояние светофора)
    private TrafficLightColor1 tlc;   //текущий свет светофора
    boolean stop = false;            //для остановки имитации надо установить его в true
    boolean changed = false;         //светофор не переключился (уустановить в true, если светофор переключился, то есть цвет поменялся)


    //данный конструктор позволяет задать начальный цвет
    TrafficLightSimulator1 (TrafficLightColor1 init) {    //тип параметра - перечисление TrafficLightColor
        tlc = init;

        thrd = new Thread(this);          //this означает вызов метода run() для объекта thrd
        thrd.start();                            //старт потока
    }

    //данный конструктор задает красный цвет по умолчанию
    TrafficLightSimulator1 () {
        tlc = TrafficLightColor1.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    public void run(){
        while (!stop){
            try {
                   Thread.sleep(tlc.getDelay());
                }

            catch (InterruptedException exc){
                System.out.println("Прерывание потока " + exc);
            }
            changeColor();
        }
    }


    synchronized void changeColor () {
        int i = 0;

       for (TrafficLightColor1 t : TrafficLightColor1.values()) {
           i = t.ordinal();
       }

            if(i == 0){
                tlc = TrafficLightColor1.YELLOW;
            }
           if (i == 1){
               tlc = TrafficLightColor1.GREEN;
           }
            if (i == 2){
                tlc = TrafficLightColor1.RED;
            }


        /*
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor1.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor1.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor1.YELLOW;
                break;

        }
*/
        changed = true;
        notify();
    }

    //данный метод не завершится, пока не изменится цвет светофора
    synchronized void waitForChange () {
        try {
            while (!changed){
                wait();
            }
            changed = false;
        }
        catch (InterruptedException exc){
            System.out.println(exc);
        }
    }


    //возвращает текущий цвет светофора
    TrafficLightColor1 getColor() {
        return tlc;
    }

    //останавливает светофор
    void cancel() {
        stop = true;
    }
}


public class TrafficLightDemo_4 {
    public static void main (String args[]){
        TrafficLightSimulator1 tls = new TrafficLightSimulator1(TrafficLightColor1.GREEN);

        for (int i = 0; i < 9; i++){
            System.out.println(tls.getColor());
            tls.waitForChange();
        }
        tls.cancel();
    }
}

