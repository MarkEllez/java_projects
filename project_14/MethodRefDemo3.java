package project_14;

class MyIntNum1 {
    private int v;

    MyIntNum1 (int n){
        v = n;
    }

    int getNum(){
        return v;
    }

    boolean isFactor (int n){
        return (v%n) ==0;
    }
}


public class MethodRefDemo3 {
    public static void main (String args[]){
        boolean result;

        MyIntNum1 myIntNum1 = new MyIntNum1(12);
        MyIntNum1 myIntNum2 = new MyIntNum1(16);

        MyintNumPredicate ip = MyIntNum1::isFactor;

        result = ip.test(myIntNum1, 3);
        if (result)
            System.out.println("3 является делителем " + myIntNum1.getNum());


        result = ip.test(myIntNum2, 3);
        if (!result)
            System.out.println("3 не является делителем " + myIntNum2.getNum());


    }
}
