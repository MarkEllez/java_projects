package project_5;

public class Check_5_3 {
    public static void main (String args[]){
        double io[] = {75, -9, 33, 28, 44, 90, 43, 81, 7, 1};
        double sum = 0;
        double counter = 0;


        for (int i = 0; i < 10; i++){
            sum = sum + io[i];
            counter++;
        }

        System.out.println("Среднее арифмтичиеское равно " + sum/counter);


    }
}