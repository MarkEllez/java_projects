package project_16_Swing;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class TFDemo implements ActionListener{
    JTextField jtf;
    JButton jbt;
    JLabel jlblPrompt, jlabContents;

    TFDemo(){
        JFrame jfrm = new JFrame("JTF Example");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(800, 600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");

        jbt = new JButton("Reverse");

        jtf.addActionListener(this);
        jbt.addActionListener(this);

        jlblPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel();

        jfrm.add(jtf);
        jfrm.add(jbt);
        jfrm.add(jlblPrompt);
        jfrm.add(jlabContents);

        jfrm.setVisible(true);

    }

    public void actionPerformed (ActionEvent ae) {

        if (ae.getActionCommand().equals("Reverse")){
            String orgStr = jtf.getText();
            String resStr = "";

            for (int i = orgStr.length()- 1; i>=0; i--)
                resStr += orgStr.charAt(i);

            jtf.setText(resStr);
        }
        else
            jlabContents.setText("You pressed Enter. Text is: " + jtf.getText());

    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }


}
