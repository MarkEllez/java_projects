package project_10;

import java.io.*;

public class CompFiles {
    public static void main (String args[]){
        int i = 0, j = 0, count = 0;


        if (args.length > 0) {
            System.out.println("Usage of CompFiles first.txt second.txt");
            return;
        }



        try (FileInputStream f1 = new FileInputStream("D:\\JAVA\\Java Projects\\project_10\\first.txt");
                FileInputStream f2 = new FileInputStream("D:\\JAVA\\Java Projects\\project_10\\second.txt"))
            {

            do {
                i = f1.read();
                j = f2.read();

                count++;
                if (i != j & (char)i + 32 == j & (char)j + 32 == i) break;  //нет учета регистра символов
            }
            while (i != -1 && j != -1);

                if (i != j) {
                    System.out.println("Mismatching of files");
                    System.out.println("The first number of mismatching symbols are: " + count);
                }
                else
                    System.out.println("Files are matched");

        }
        catch (IOException exc){
            System.out.println("Input-output error:" + exc);
        }
    }
}
