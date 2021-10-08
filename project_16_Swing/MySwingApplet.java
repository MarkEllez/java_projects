package project_16_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<object code="MySwingApplet" width=200 height= 80>
</object>
 */

public class MySwingApplet extends JApplet {
    JButton jbtUp, jbtDown;
    JLabel jlbl;

    public void init(){
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        }
        catch (Exception ex){
            System.out.println("Can't create cause of " + ex);
        }
    }

    public void makeGUI (){
        setLayout(new FlowLayout());

        jbtUp = new JButton("Up");
        jbtDown = new JButton("Down");

        jbtUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbl.setText("You pressed up");
            }
        });

        jbtDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbl.setText("You pressed down");
            }
        });

        add(jbtUp);
        add(jbtDown);

        jlbl = new JLabel("");

        add(jlbl);
    }
}
