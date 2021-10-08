package project_12;

enum TrafficLightColor {
    RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable {
    private Thread thrd;             //поток для имитации светофора (регулирует состояние светофора)
    private TrafficLightColor tlc;   //текущий свет светофора
    boolean stop = false;            //для остановки имитации надо установить его в true
    boolean changed = false;         //светофор не переключился (уустановить в true, если светофор переключился, то есть цвет поменялся)


    //данный конструктор позволяет задать начальный цвет
    TrafficLightSimulator (TrafficLightColor init) {    //тип параметра - перечисление TrafficLightColor
        tlc = init;

        thrd = new Thread(this);          //this означает вызов метода run() для объекта thrd
        thrd.start();                            //старт потока
    }

    //данный конструктор задает красный цвет по умолчанию
    TrafficLightSimulator () {
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    public void run(){
        while (!stop){
            try {
                switch (tlc){
                    case GREEN:
                        Thread.sleep(1000);
                    break;
                    case YELLOW:
                        Thread.sleep(200);
                    break;
                    case RED:
                        Thread.sleep(1200);
                    break;
                }
            }
            catch (InterruptedException exc){
                System.out.println("Прерывание потока " + exc);
            }
            changeColor();
        }
    }


    synchronized void changeColor () {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
            break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
            break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;

        }
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
    TrafficLightColor getColor() {
        return tlc;
    }

    //останавливает светофор
    void cancel() {
        stop = true;
    }
}


public class TrafficLightDemo {
    public static void main (String args[]){
        TrafficLightSimulator tls = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 9; i++){
            System.out.println(tls.getColor());
            tls.waitForChange();
        }
        tls.cancel();
    }
}
