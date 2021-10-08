package project_10;

import java.io.*;

public class AvgNums {
    public static void main (String args[])
        throws IOException {
            String str;
            int n;
            double sum = 0;
            double avg, t;

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.println("Ввод символов: ");
            str = br.readLine();                                   //ЧТЕНИЕ СИМВОЛОВ

            try {
                n = Integer.parseInt(str);                         //ПРЕОБРАЗОВАНИЕ В INT
            }
            catch (NumberFormatException exc){
                System.out.println("Неверный формат");
                n = 0;
            }

    //n в данном примере рассматривается как количество
            System.out.println("Ввод " + n + " значений");

            for (int i = 0; i < n; i++) {
                System.out.println(":");
                str = br.readLine();                                //ЧТЕНИЕ СИМВОЛОВ
                try {
                    t = Double.parseDouble(str);                    //ПРЕОБРАЗОВАНИЕ В DOUBLE
                } catch (NumberFormatException exc) {
                    System.out.println("Неверный формат");
                    t = 0;
                }
                sum += t;                                           //ПОДСЧЕТ СУММЫ
            }


               avg = sum/n;                                        //ПОДСЧЕТ СРЕДНЕГО ЗНАЧЕНИЯ
               System.out.println("Среднее значение " + avg);

    }
}
