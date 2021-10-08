package project_14.Exercizes;

import project_14.IntPredicate;

class MyIntNum{
    private int v;

    MyIntNum (int x){
        v = x;
    }

    int getNum (){
        return v;
    }

    boolean isFactor (int n){
        return (v%n) == 0;
    }

    boolean hasCommonFactor (int f){
        for (int i = 2; i < v/i; i++)
            if ( ((v/i) == 0) && ((f/i) == 0)  ) return true;

        return false;
    }

}

public class Task_16_MethodRefDemo2 {
    public static void main (String args[]){
        boolean result;

        MyIntNum myNum = new MyIntNum(12);

        IntPredicate ip = myNum::hasCommonFactor;

        result = ip.test(6);

        if (result)
            System.out.println("Общий делитель найден");
        else
            System.out.println("Общий делитель не найден");


    }
}
