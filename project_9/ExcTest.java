package project_9;

public class ExcTest {
    static void genException(){
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        nums[7] = 10;

        System.out.println("Эта строка не будет отображаться");
    }
}

 class ExcTestDemo {
    public static void main (String args[]){
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}
