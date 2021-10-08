package project_16_Swing;


/*
The program is for files comparison
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class Task_17_Swing implements ActionListener{

    JTextField jtfFirst;    //поле для первого файла
    JTextField jtfSecond;   //поле для второго файла

    JButton jbt;        // кнопка Compare

    JLabel jlblFirst, jlblSecond, jlblResult, jlblCheckBox; // подсказки для юзера, результат сравнения, расхождение

    JCheckBox jchbx;

    Task_17_Swing () {
        JFrame jfrm = new JFrame("Comparison of files");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(800, 600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        jchbx = new JCheckBox("Show position of mismatch");

        jbt = new JButton("Compare");

        jbt.addActionListener(this);

        /*
        Listener is added only for button, because before pressing on it, it doesn't matter what text fields consists of
         */

        jlblFirst = new JLabel("First file: ");
        jlblSecond = new JLabel("Second file: ");
        jlblResult = new JLabel("");
        jlblCheckBox = new JLabel("");

        jfrm.add(jtfFirst);
        jfrm.add(jtfSecond);
        jfrm.add(jbt);
        jfrm.add(jlblFirst);
        jfrm.add(jlblSecond);
        jfrm.add(jlblResult);
        jfrm.add(jchbx);
        jfrm.add(jlblCheckBox);

        jfrm.setVisible(true);

    }


    public void actionPerformed (ActionEvent ae){
        int i = 0, j = 0, count = 0;

        if (jtfFirst.getText().equals("")){
            jlblResult.setText("The first file name is missing ");
            return;
        }

        if (jtfSecond.getText().equals("")) {
            jlblResult.setText("The second file name is missing");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())){

            do {
                i = f1.read();
                j = f2.read();

                count++;
                if (i != j)
                    break;
            }
            while (i != -1 && j != -1);

            if (i != j) {
                jlblResult.setText("Files are different");

                if (jchbx.isSelected()){
                    jlblCheckBox.setText("The position of mismatching is " + count);
                }

            }
            else
                jlblResult.setText("Files are the same");

        }
        catch (IOException ex){
            jlblResult.setText("File error");
        }
    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Task_17_Swing();
            }
        });
    }


}

