package project_14.Exercizes;

public class Task_5 {
    public static void main (String args[]){
        Task_5_Range task = (n) -> (n >= 10 && n <= 20);


        System.out.println("5 в диапазоне? " + task.test(5));
        System.out.println("14 в диапазоне? " + task.test(14));
    }
}
