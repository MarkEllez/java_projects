package project_10;


import java.io.*;

class Help {
    String helpfile;

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;

        try (BufferedReader helpRdr = new BufferedReader(
                new FileReader("D:\\JAVA\\Java Projects\\project_10\\helpfile.txt")))
        {

            do {
                ch = helpRdr.read();

                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        }
                        while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            }
            while (ch != -1);

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);
            return false;
        }

        return false;
    }

    //МЕТОД, ПОКАЗЫВАЮЩИЙ ТЕМУ СПРАВКИ

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("\rУкажите тему: ");

        try {
            topic = br.readLine();
        }
        catch (IOException exc){
            System.out.println("Ошибка при чтении с консоли");
        }

        return topic;
    }
}


public class FileHelp {
    public static void main (String args[]){
        Help helpObj = new Help("D:\\JAVA\\Java Projects\\project_10\\helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой: \n" + "Для выхода из системы введите 'stop'.");

        do {
            topic = helpObj.getSelection();

            if(!helpObj.helpon(topic)){
                System.out.println("Тема не найдена.\n");
            }
        }
        while (topic.compareTo("stop") != 0);

    }
}
