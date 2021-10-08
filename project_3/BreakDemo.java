package project_3;

public class BreakDemo {
    public static void main(String args[]){
        int num = 100;

        for (int i = 0; i < num; i++) {
            if (i * i >= 100) break;
            System.out.println(i + " ");
        }
    }
}
