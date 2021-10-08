package project_5;

public class Checkings {
    public static void main(String args[]) {
        double s[] = {1, 2, 3, 4, 5};
        double p[] = new double[5];

        System.out.println("Первый массив: ");
        for (int i = 0; i < 5; i++){
            System.out.print(s[i] + " ");
        }

        System.out.println("\n" + "Второй массив: ");
        p[0] = 1;
        p[1] = 2;
        p[2] = 3;
        p[3] = 4;
        p[4] = 5;

        for (int j = 0; j < 5; j++){
            System.out.print(p[j] + " ");
        }

    }
}