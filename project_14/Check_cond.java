package project_14;

public class Check_cond{
    public static void main (String args[]){
        NumericTest val1 = (n, v) -> (n%v) == 0;

        NumericTest val2 = (n, v) -> (n<v) == true;

        NumericTest val3 = (n, v) -> (Math.abs(n) == Math.abs(v));

        NumericTest val4 = (n, v) -> (n < 0 ? n : -n) == (v < 0 ? v : -v);

        System.out.println("Dividing: " + val1.test( 4, 2));
        System.out.println("Comparison of values: " + val2.test(5, 4));
        System.out.println("Comparison of abs. values via Math method: " + val3.test(6, -6));
        System.out.println("Comparison of abs values: " + val4.test(4, -4));
    }
}
