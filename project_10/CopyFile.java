package project_10;

import java.io.*;

public class CopyFile {
    public static void main (String args[]){
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //all file names are received by the program
        if (args.length != 2){
            System.out.print("Usage of CopyFile test1.txt test2.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }
            while (i != -1);
        }
        catch (IOException exc){
            System.out.println("Input-output error: " + exc);
        }

        finally {
            try {
                if (fin != null)
                    fin.close();
            }
            catch (IOException exc){
                System.out.print("Error while input file closing");
            }

            try {
                if (fout != null)
                    fout.close();
            }
            catch (IOException exc){
                System.out.print("Error while output file closing");
            }
        }
    }
}
