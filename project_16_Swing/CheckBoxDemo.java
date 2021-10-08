package project_16_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxDemo implements ItemListener{
    JLabel jlblSelected;
    JLabel jlblChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBetta;
    JCheckBox jcbGamma;

    CheckBoxDemo () {
        JFrame jfrm = new JFrame("CheckBox Demo");

        jfrm.setLayout(new FlowLayout()); //объект для менеджера компоновки
        jfrm.setSize(800, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlblSelected = new JLabel("");
        jlblChanged = new JLabel("");

        jcbAlpha = new JCheckBox("Alpha");
        jcbBetta = new JCheckBox("Betta");
        jcbGamma = new JCheckBox("Gamma");

        jcbAlpha.addItemListener(this);
        jcbBetta.addItemListener(this);
        jcbGamma.addItemListener(this);

        jfrm.add(jcbAlpha);
        jfrm.add(jcbBetta);
        jfrm.add(jcbGamma);
        jfrm.add(jlblChanged);
        jfrm.add(jlblSelected);

        jfrm.setVisible(true);
    }

    public void itemStateChanged (ItemEvent ie) {
        String str = "";

        JCheckBox cb = (JCheckBox) ie.getItem();  //получение ссылки на флажок, состояние которого поменялось

        if (cb.isSelected())    //определяет текущее состояние флажка
            jlblChanged.setText(cb.getText() + " was just selected");
        else
            jlblChanged.setText(cb.getText() + " was just cleared");

        if (jcbAlpha.isSelected()){
            str += "Alpha ";
        }
        if (jcbBetta.isSelected()){
            str += " Betta ";
        }
        if (jcbGamma.isSelected()){
            str += " Gamma";
        }

        jlblSelected.setText("Selected checkboxes are: " + str);
    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxDemo();
            }
        });
    }
}
