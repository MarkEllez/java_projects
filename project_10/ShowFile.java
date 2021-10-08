package project_10;

import java.io.*;

public class ShowFile {
    public static void main (String args[]){
        int i;
        FileInputStream fin;

        if (args.length != 1){
            System.out.print("Usage: ShowFile test.txt");
            return;
        }

        try {
            fin = new FileInputStream("D:\\JAVA\\Java Projects\\test.txt");      //open file
        }
        catch (FileNotFoundException exc){
            System.out.print("File isn't found");
            return;
        }



        try {
            do {
                i = fin.read();                      //read file
                if (i != -1) {
                    System.out.print((char)i);
                }
            }
            while (i != -1);
        }
        catch (IOException exc){
            System.out.println("Error while reading file");
        }

        finally {
            try {
                fin.close();                            //close file
            }
            catch (IOException exc){
                System.out.println("Error while closing file");
            }
        }

    }
}
