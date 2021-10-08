package project_15_AWT.Tasks;

import java.awt.*;
import java.applet.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Task_15_7_Mouse extends Applet implements MouseListener, MouseMotionListener {

    String msg = "";
    int mouseX = 0;
    int mouseY = 0;
    int mouseX2 = 0;
    int mouseY2 = 0;
    boolean draw;

    public void init () {
        addMouseListener(this);
        addMouseMotionListener(this);
        draw = false;
    }

    public void mouseClicked(MouseEvent me){

    }

    public void mouseEntered (MouseEvent me) {

    }

    public void mouseExited (MouseEvent me) {

    }

    public void mousePressed (MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        draw = true;
    }

    public void mouseReleased(MouseEvent me){
        draw = false;
        showStatus("Mouse is released");
    }

    public void mouseDragged (MouseEvent me) {
        mouseX2 = me.getX();
        mouseY2 = me.getY();
        repaint();
    }


    public void mouseMoved (MouseEvent me){
        showStatus("Mouse is moving");
    }

    public void paint (Graphics g){
        g.drawLine(mouseX, mouseY, mouseX2, mouseY2);
    }

}
