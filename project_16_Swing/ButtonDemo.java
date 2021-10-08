package project_16_Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonDemo implements ActionListener{

    JLabel jlbl;

    ButtonDemo () {

        JFrame jfrm = new JFrame("Button example");  //новый контейнер

        jfrm.setLayout(new FlowLayout());  //создание объекта FlowLayout для менеджера компоновки

        jfrm.setSize(220, 90);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //закрыть приложение при закрытии окна приложения

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

    public void actionPerformed (ActionEvent ae){       //обработка событий кнопки
        if (ae.getActionCommand().equals("Up"))
            jlbl.setText("You pressed Up");
        else
            jlbl.setText("You pressed Down");
    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
