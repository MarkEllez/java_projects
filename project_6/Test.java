package project_6;

public class Test {
    int a,b;


    Test (int i, int j){
        a = i;
        b = j;
    }

    void Ch (Test ob){
        ob.a = ob.a + ob.b;
        ob.b = - ob.b;
    }

}

class Change {
    public static void main (String args[]){
        Test ob = new Test(15, 20);

        ob.Ch(ob);

        System.out.println(ob.a + " " + ob.b);
    }
}