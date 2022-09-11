package project_3;

public class ContToLabel {
    public static void main (String args[]){

       overlo: for (int i =1; i < 10; i++){
                    System.out.println("\nВнешний цикл: " + i + ", внутренний цикл");

                    for (int j =1; j< 10; j++) {
                        if (j == 2)
                            continue overlo;
                        System.out.print(j);
                    }
        }
    }
}
