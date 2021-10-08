package project_10;

import java.io.*;

public class CopyText_8 {
    public static void main (String args[]){

        int i;

        try (FileReader fr = new FileReader("D:\\JAVA\\Java Projects\\project_10\\7_10_task.txt");
             FileWriter fw = new FileWriter("D:\\JAVA\\Java Projects\\project_10\\7_10_task_Copy.txt");){


             do {
                 i = (char) fr.read();

                 if (i != ' ')
                     i = '-';

                 System.out.print("What is read: " + (char)i);

                 if (i != -1) fw.write(i);

                 System.out.print("What is written: " + (char)i);

             }
             while (i != -1);

        }
        catch (IOException exc){
            System.out.print(exc);
        }
    }
}
