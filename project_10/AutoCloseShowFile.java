package project_10;

import java.io.*;

public class AutoCloseShowFile {
    public static void main (String args[]){
        int i;

        if (args.length != 1){
            System.out.print("Usage of AutoCloseShowFile test.txt");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            }
            while (i != -1);
        }
        catch (IOException exc){
            System.out.print("Error of input-output: " + exc);
        }
    }
}
