package project_10;

import java.io.*;

public class RWData {
    public static void main (String args[]){
        int i = 10;
        double d = 1023.56;
        boolean b = true;

//создаем объекти типа FileOutputStream для записи байтов в файл
//создаем объект типа DataOutputStream для записи примитивных типов данных
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))){
            System.out.println("Wrote " + i);
            dataOut.writeInt(i);

            System.out.println("Wrote: " + d);
            dataOut.writeDouble(d);

            System.out.println("Wrote: " + b);
            dataOut.writeBoolean(b);
        }
        catch (IOException exc){
            System.out.println("Error while writing: " + exc);
            return;
        }

        System.out.println();

//создаем объект типа FileInputStream для чтения байтов из файла
//создаем объекти типа DataInputStream для чтения примитивных типов данных
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))){

            i = dataIn.readInt();
            System.out.println("Read: " + i);

            d = dataIn.readDouble();
            System.out.println("Read: " + d);

            b = dataIn.readBoolean();
            System.out.println("Read: " + b);

        }
        catch (IOException exc){
            System.out.println("Error while reading: " + exc);
        }

        System.out.println();
    }
}
