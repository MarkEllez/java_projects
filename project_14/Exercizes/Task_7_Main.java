package project_14.Exercizes;

public class Task_7_Main {
    public static void main (String args[]){
        Task_7_Numeric_func num = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = result*i;

            return result;
        };

        System.out.println(num.func(3));
    }
}
