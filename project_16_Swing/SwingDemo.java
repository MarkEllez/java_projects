package project_16_Swing;

import javax.swing.*;

 class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("Easy swing application");   //создание объекта контейнера

        jfrm.setSize(500, 300);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершить программу при закрытии окна - в качестве параметра передается константа

        JLabel jlbl = new JLabel("Kui zhelezo");  //создание объекта компонента

        jfrm.add(jlbl);  //помещение компонента в контейнер

        jfrm.setVisible(true); //контейнер становится видимым
    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
