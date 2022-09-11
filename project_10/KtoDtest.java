package project_10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoDtest {
    public static void main (String args[]){
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter("D:\\JAVA\\Java Projects\\test.txt", true)){
            do {
                System.out.println("Enter any symbol: ");
                str = br.readLine();

                if (str.compareTo("stop") == 0)
                    break;

                str = str + "\r\n";

                fw.write(str);
            }
            while (str.compareTo("stop") == 0);
        }
        catch (IOException exc){
            System.out.println(exc);
        }
    }
}
