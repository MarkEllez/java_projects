package project_3;

public class SwitchDemo {
    public static void main(String args[]){
        int i;

        for (i = 0; i < 5; i++)
            switch (i) {
                case 5:
                    System.out.println("Переменная равна нулю");
                    break;
                case 1:
                    System.out.println("Переменная равна единице");
                    break;
                default:
                    System.out.println("Переменная больше единицы");
            }
        }
    }

