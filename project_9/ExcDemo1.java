package project_9;

public class ExcDemo1 {
    public static void main (String args[]){
        int nums[] = new int[4];

        try {
            System.out.println("До генерации исключения");
            nums[7] = 10;

            System.out.println("Эта строка не будет выводиться");
        }

        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за границы массива, грязное животное!");
        }

        System.out.println("После оператора catch");
    }
}
