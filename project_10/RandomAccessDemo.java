package project_10;

import java.io.*;

public class RandomAccessDemo {
    public static void main (String args[])
        throws IOException {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("D:\\JAVA\\Java Projects\\project_10\\random.txt", "rw")){
            for (int i =0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            raf.seek(0);   // найти первое значение типа double
            d = raf.readDouble();
            System.out.println("The first value: " + d);

            raf.seek(8);   // найти второе значение типа double
            d = raf.readDouble();
            System.out.println("The second value: " + d);

            raf.seek(8*3);  //найти четвертое значение типа double
            d = raf.readDouble();
            System.out.println("The fourth value: " + d);
        }
        catch (IOException exc){
            System.out.println(exc);
        }
    }
}
