package project_3;

public class NoBreak {
    public static void main(String args[])
        throws java.io.IOException{
            int i;

            for (i = 0; i < 3; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Переменная равна нулю");
                    case 1:
                        System.out.println("Переменная равна единице");
                    case 2:
                        System.out.println("Переменная равна двум");
                    case 3:
                        System.out.println("Переменная равна трем");
                }
                System.out.println(" ");

            }
        }
    }

