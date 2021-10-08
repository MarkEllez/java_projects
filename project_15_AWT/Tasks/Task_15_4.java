package project_15_AWT.Tasks;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Task_15_4 extends Applet implements Runnable {

    String msg;
    Thread t;
    Calendar clock;
    boolean stopFlag;


    public void init(){
        t = null;
    }

    public void start(){
        t = new Thread(this);
        t.start();
        stopFlag = false;

    }

    public void run () {
        for (;;){
            try {
                repaint();
                Thread.sleep(1000);
                if (stopFlag)
                    break;
            }catch (InterruptedException exc){
                return;
            }
        }
    }

    public void stop () {
        stopFlag = false;
        t = null;
        msg = null;
    }

    public void paint (Graphics g){
        clock = Calendar.getInstance();
        msg = Integer.toString(clock.get(Calendar.HOUR)) + ":" + Integer.toString(clock.get(Calendar.MINUTE)) +
            ":" + Integer.toString(clock.get(Calendar.SECOND));
        g.drawString(msg, 50, 50);
    }
}
