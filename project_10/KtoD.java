package project_10;

import java.io.*;

public class KtoD {
    public static void main (String args[]){
        String str;

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter("D:\\JAVA\\Java Projects\\test.txt", true)){

            do {
                System.out.println("Введите символ: ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n";

                fw.write(str);
            }
            while (str.compareTo("stop") != 0);

        }
        catch (IOException exc){
            System.out.println(exc);
        }
    }
}
