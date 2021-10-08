package project_7;

public class A {
    int i;
}

class B extends A {
    int i;

    B (int a, int b){
        super.i = a; //super.i ссылается на переменную i класса A
        i = b; // ссылка на переменную i класса B
    }

    void Show(){
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}

class S {
    public static void main (String args[]){
        B ob = new B(1,2 );

        ob.Show();
    }
}
