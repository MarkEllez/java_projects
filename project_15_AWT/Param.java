package project_15_AWT;

import java.awt.*;
import java.applet.*;


/*
<applet code =Param width ="300" height = "50">
	<param name =author value="Herb Schildt">
	<param name=purpose value = "Demo">
	<param name=version value="2">
</applet>
 */


public class Param extends Applet{
    String author;
    String purpose;
    int ver;

    public void start(){
        String temp;


        author = getParameter("author");
        if (author == null)
            author = "not found";

        purpose = getParameter("purpose");
        if (purpose == null)
            purpose = "not found";

        temp = getParameter("version");
            try {
                if (temp != null)
                    ver = Integer.parseInt(temp);
                else
                    ver = 0;
            } catch (NumberFormatException exc){
                ver = -1;
            }
    }

    public void paint (Graphics g){
        g.drawString(author, 10, 20);
        g.drawString(purpose, 10, 40);
        g.drawString(String.valueOf(ver), 10, 60);
    }

}
