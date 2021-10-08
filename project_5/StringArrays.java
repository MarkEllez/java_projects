package project_5;

public class StringArrays {
    public static void main (String args[]){
        String str[] = {"Эта", "Строка", "Является", "Тестом"};

        System.out.println("Исходный массив: ");
        for (String x: str) {
            System.out.print(x + " ");
        }
        System.out.println();


        //Поменять строку
        str[1] = "Стринга";
        str[3] = "Тестом-херестом";

        System.out.println("Измененный массив:");
        for (String x: str){
            System.out.print(x + " ");
        }
    }
}
