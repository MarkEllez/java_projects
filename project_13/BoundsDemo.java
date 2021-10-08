package project_13;

class NumericFns<T extends Number>{
    T num;

    NumericFns(T n){
        num = n;
    }

    double reciprocal(){
        return 1/num.doubleValue();
    }

    double fraction(){
        return num.doubleValue() - num.intValue();
    }

}


public class BoundsDemo {
    public static void main (String args[]){
        NumericFns<Integer> obj = new NumericFns<>(5);

        System.out.println("Обратная величина obj - " + obj.reciprocal());

        System.out.println("Дробная часть obj - " + obj.fraction());

        System.out.println();

        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Обратная величина dOb - " + dOb.reciprocal());
        System.out.println("Дроюная часть dOb - " + dOb.fraction());

        // NumericFns<String> sOb = new NumericFns<String>("test") - не будет компилироваться, так как String не является производным от класса Number
    }

}
