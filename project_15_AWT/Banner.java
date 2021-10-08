package project_15_AWT;

import java.awt.*;
import java.applet.*;

/*
<applet code = "project_15_AWT.Banner" width = "600" height = "250">
	<param name = "msg" value = " Java rules the web ">
	</param>
	<param name = "delay" value = "1000">
	</param>
</applet>
 */

public class Banner extends Applet implements Runnable{
    String msg;
    Thread t;
    boolean stopFlag; //переменная служит для приостановки апплета
    int delay;


    public void init(){
        String temp;

        temp = getParameter("delay");
            try {

                if (temp != null)
                    delay = Integer.parseInt(temp);
                else
                    delay = 250;
            }
            catch (NumberFormatException exc){
                delay = 250;
            }

        t = null;
    }


    public void start(){
        t = new Thread(this); //создается поток выполнения, ссылка на который присваивается переменной t (this указывает на t)
        stopFlag = false;
        t.start(); //этот метод start относится к потоку Thread, но не к апплету

        msg = getParameter("msg");
            if (msg == null)
                msg = "No params";
    }

    public void run(){
        for (;;){
            try {
                repaint();
                Thread.sleep(delay);
                if (stopFlag)
                    break;
            } catch (InterruptedException exc){}
        }
    }

    public void stop(){
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g){
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1);
        msg = msg + ch;
        g.drawString(msg, 50, 30);

        showStatus("Status");
    }

}
