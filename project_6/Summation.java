package project_6;

public class Summation {
    int sum;

    Summation (int num){
        sum = 0;
        for (int i = 0; i <= num; i++)
            sum += i;
    }

    Summation (Summation t){  //создается конструктор, который по сути копирует значение sum из первого конструктора
        sum = t.sum;
    }
}

class Check {
    public static void main (String args[]){
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println(s1.sum + " " + s2.sum);

        //для s1.sum высчитывается сумма на основании первого конструктора
        //s2.sum высчитывается на основании второго конструктора (то есть тут по сути s1.sum = s2,sum) - отдельно сумма для s2 не высчитывается
    }



}
