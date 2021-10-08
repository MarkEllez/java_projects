package project_14.First_lymbda_ex;

public class Lymbda_example2 {
    public static void main (String args[]){
        MyValue2 myVal2 = (n) -> 1/n ;

        System.out.println(myVal2.getvalue2(4.0));


       // MyValue2 myValue = (n) -> "three";   //не скомпилируется из-за несовместимости типов лямбды выражения и функц интерф

    }
}
