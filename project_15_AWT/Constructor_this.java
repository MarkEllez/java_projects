package project_15_AWT;

class MyClass {
    int a;
    int b;

    MyClass (int i, int j){
        a = i;
        b = j;
    }

    MyClass (int i){
        this(i, i);
    }

    int meth(){
        return a + b;
    }

}

public class Constructor_this {
    public static void main (String args[]){

        MyClass m = new MyClass(8);

        //assert m.meth() < 0 : 1;

        System.out.println(m.meth());
    }
}
