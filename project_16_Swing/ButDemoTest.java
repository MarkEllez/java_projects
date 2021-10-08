package project_16_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButDemoTest implements ActionListener {
    JLabel jlbl;

    ButDemoTest () {
        JFrame jfrm = new JFrame("Test");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(1200, 600);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jUp = new JButton("Up");
        JButton jDown = new JButton("Down");

        jUp.addActionListener(this);
        jDown.addActionListener(this);

        jfrm.add(jUp);
        jfrm.add(jDown);

        jlbl = new JLabel("Press a button");
        jfrm.add(jlbl);

        jfrm.setVisible(true);

    }

    public void actionPerformed (ActionEvent ae){
        if (ae.getActionCommand().equals("Up"))
            jlbl.setText("Up button is pressed");
        if (ae.getActionCommand().equals("Down"))
            jlbl.setText("Down button is pressed");

    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButDemoTest();
            }
        });
    }
}
