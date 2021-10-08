package project_13;

class NumericFns1<T extends Number> {
    T num;

    NumericFns1 (T n){
        num = n;
    }

    double reciprocal1 () {
        return  1 / num.doubleValue();
    }

    double fractoin1 () {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual (NumericFns1<?> ob){
        if (Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;

            return false;
    }

}

public class WildcardDemo {
    public static void main (String args[]){
        NumericFns1<Integer> iOb = new NumericFns1<>(6);

        NumericFns1<Double> dOb = new NumericFns1<>(-6.0);

        NumericFns1<Long> lOb = new NumericFns1<>(5L);

        System.out.println("Сравнение iOb и dOb");

        if (iOb.absEqual(dOb))
            System.out.println("Значения iOb и dOb совпадают");
        else
            System.out.println("Значение iOb и dOb различаются");

        if (dOb.absEqual(lOb))
            System.out.println("Значения dOb и lOb совпадают");
        else
            System.out.println("Значения dOb и lOb различаются");
    }
}
