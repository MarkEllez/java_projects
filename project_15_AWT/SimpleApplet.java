package project_15_AWT;

import java.awt.*;
import java.applet.*;


/*
<applet code = "project_15_AWT.SimpleApplet" width = 200 height = 60>
</applet>

 */

public class SimpleApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Java makes applets easy", 20, 20);
    }
}
