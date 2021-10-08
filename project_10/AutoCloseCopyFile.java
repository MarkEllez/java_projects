package project_10;

import java.io.*;

public class AutoCloseCopyFile {
    public static void main (String args[]){
        int i;

        if (args.length != 2){
            System.out.print("Usage of AutoCloseCopyFile test1.txt test2.txt");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }
            while (i != -1);
        }
        catch (IOException exc){
            System.out.print("Error: " + exc);
        }
    }
}
