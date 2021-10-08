package project_14.First_lymbda_ex;

public class Lymbda_example{
    public static void main (String args[]) {

        MyValue myVal = () -> 98.6;

        System.out.println(myVal.getValue());
    }
}
