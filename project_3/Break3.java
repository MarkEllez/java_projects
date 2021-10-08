package project_3;

public class Break3 {
    public static void main(String args[]){

        for (int i = 0; i < 3; i++){
            System.out.println("Счетчик внешнего цикла: " + i);
            System.out.println("Счетчик внутреннего цикла: ");

            int t = 0;
            while (t<100){
                t++;
                if (t == 10) break;
                System.out.println(t);
            }

        }
        System.out.println("Циклы завершены");
    }
}
