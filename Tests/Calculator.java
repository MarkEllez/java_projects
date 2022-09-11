package Tests;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter first value");
        double a = scanner.nextDouble();

        System.out.println("Enter second value");
        double b = scanner.nextDouble();

        System.out.println("Enter sign");
        String sign = scanner1.nextLine();

        double c = 0;

        switch (sign){
            case ("+"):
                c = a + b;
                break;
            case ("-"):
                c = a - b;
                break;
            case ("*"):
                c = a * b;
                break;
            case ("/"):
                c = a / b;
                break;
        }


        System.out.println(c);









    }
}
