package project_3;

public class FindFac {

    public static void main(String args[]) {
            for (int i = 2; i <= 100; i++) {

                System.out.println("Дeлитeли " + i + ": ");

                for (int j = 2; j < i; j++)

                if ((i % j) == 0)

                System.out.print(j + " ");

                System.out.println('\n');
            }
             System.out.println();
        }
    }