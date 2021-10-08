package project_10;

import java.io.*;

public class FileReadSymb {
    public static void main (String args[]){
        String s;

        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\JAVA\\Java Projects\\test.txt"))){

            while ((s = br.readLine()) != null)
                System.out.println(s);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
