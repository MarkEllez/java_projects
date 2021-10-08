package project_12;

@Deprecated
class MyClass12 {
    private String msg;

    MyClass12 (String m){
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }
}

public class AnnoDemo {
    public static void main (String args[]){
        MyClass12 m = new MyClass12("test");

        System.out.println(m.getMsg());
    }
}
