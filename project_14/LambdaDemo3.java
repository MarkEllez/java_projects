package project_14;

public class LambdaDemo3 {
    public static void main (String args[]){
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str1 = "It is test";

        System.out.println("Tested string: " + str1);

        if (isIn.test(str1, "her"))
            System.out.println("The 'her' is present in the main expression");
        else
            System.out.println("The 'her' is absent in the main expression");

        if (isIn.test(str1, "test"))
            System.out.println("The 'test' is present in the main expression");
        else
            System.out.println("The 'test' is absent in the main expression");

    }
}
