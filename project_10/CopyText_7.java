package project_10;

import java.io.*;

public class CopyText_7 {
    public static void main (String args[])
           throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {

            fin = new FileInputStream("D:\\JAVA\\Java Projects\\project_10\\7_10_task.txt");
            fout = new FileOutputStream("D:\\JAVA\\Java Projects\\project_10\\7_10_task_Copy.txt");

            do {
                i = fin.read();

                if (i == ' ')
                    i = '-';
                System.out.print((char)i);

                if (i != -1) fout.write((char)i);
            }
            while (i != -1);

        }
        catch (IOException exc){
            System.out.print("Ошибка чтения файла: " + exc);
        }

        finally {
            try {
                if (fin != null)  fin.close();
            }
            catch (IOException exc){
                System.out.print("Error while closing 1st file " + exc);
            }

            try {
                if (fout != null) fout.close();
            }
            catch (IOException exc){
                System.out.print("Error while closing 2nd file " + exc);
            }

        }

    }
}
