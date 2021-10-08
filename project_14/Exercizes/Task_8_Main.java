package project_14.Exercizes;

public class Task_8_Main {
    public static void main (String args[]){
        Task_8_MyFunc<Integer> num = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++){
                result = result*i;
            }
            return result;
        };

        System.out.println(num.func(5));

    }
}
