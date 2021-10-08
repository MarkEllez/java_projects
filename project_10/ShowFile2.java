package project_10;

import java.io.*;

public class ShowFile2 {
    public static void main (String args[]){
        int i;
        FileInputStream fin = null;

        if (args.length != 1){
            System.out.print("Иcпoльзoвaниe: ShowFile test.txt");
            return;
        }

// Читать байты, пока не встретится символ EOF

        try {
            fin = new FileInputStream(args[0]);      //ОТКРЫВАЕМ ФАЙЛ
            do {
                i = fin.read();                      //ЧИТАЕМ ФАЙЛ
                if (i != -1) {
                    System.out.print((char)i);
                }
            }
            while (i != -1);
        }
        catch (FileNotFoundException exc){
            System.out.print("Файл не найден");
        }
        catch (IOException exc){
            System.out.println("Ошибка при чтении файла");
        }

        finally {
            try {
                if(fin != null)
                    fin.close();                            //ЗАКРЫВАЕМ ФАЙЛ
            }
            catch (IOException exc){
                System.out.println("Ошибка при закрытии файла");
            }
        }

    }
}
