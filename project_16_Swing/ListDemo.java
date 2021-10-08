package project_16_Swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener{
    JList jlst;
    JLabel jlbl;
    JScrollPane jscrlp;

    String names [] = { "Sherry", "Jon", "Rachel",
                        "Sasha", "Josselyn", "Randy",
                        "Tom", "Mary", "Ken",
                        "Andrew", "Matt", "Todd"};


    ListDemo () {
        JFrame jfrm = new JFrame("List Demo");

        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(800, 600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlst = new JList<String>(names);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jlst.addListSelectionListener(this);

        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120, 90));

        jlbl = new JLabel("Please choose a name");

        jfrm.add(jscrlp);
        jfrm.add(jlbl);

        jfrm.setVisible(true);
    }

    public void valueChanged (ListSelectionEvent le) {
        int idx = jlst.getSelectedIndex();  //получение индекса элемента, состояние выбора которого было изменено

        if (idx != -1)
            jlbl.setText("Current selection " + names[idx]);
        else
            jlbl.setText("Please choose a name");
    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
