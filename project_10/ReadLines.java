package project_10;

import java.io.*;

public class ReadLines {
    public static void main (String args[])
        throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Введите строку: ");

        do {
            str = br.readLine();
            System.out.println(str);
        }
        while (!str.equals("stop"));
    }

}
