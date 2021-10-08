package project_14;


class MyClass {
    private String str;

    MyClass (String s) {
        str = s;
    }

    MyClass() {
        str = "";
    }

    String getStr () {
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main (String args[]){

        MyFuncString ip = MyClass::new;        //ссылка на конструктор

        MyClass mc = ip.func("Tecтиpoвaниe");

        System.out.println(mc.getStr());

    }
}
