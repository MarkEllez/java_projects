package project_10;

import java.io.*;

public class ReadBytes {
    public static void main (String args[])
            throws IOException {
                byte data[] = new byte[10];

                System.out.print("Введите символы: ");
                System.in.read(data);
                System.out.print("Вы ввели: ");
                for (int i = 0; i < data.length; i++){
                    System.out.print((char) data[i]);
                }

    }
}
