package project_9;


class UseFinally {
    public static void genException (int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Получено " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; //деление на нуль
                break;

                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву
                break;

                case 2:
                    return; //возвратиться из блока try

            }
        }

        catch (ArithmeticException exc) {
            System.out.println("Попытка деления на нуль");
        }

        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Выход за пределы массива");
        }

        finally {
            System.out.println("Катенька - моя любовь");
        }
    }

}


public class FinallyDemo {
    public static void main (String args[]){

        for (int i = 0; i < 3; i++){
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
