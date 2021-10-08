package project_13;

class Summation {
    private int sum;

    <T extends Number> Summation (T arg){
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum(){
        return sum;
    }
}


public class GenConsDemo {
    public static void main (String args[]){
        Summation ob = new Summation(4.25);

        System.out.println("Сумма целых числе от 0 до 4.0 равна" + " " + ob.getSum());
    }
}
