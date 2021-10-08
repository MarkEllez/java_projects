package project_4;

public class Chk_num {

    boolean IsEven (int x){

        if ((x%2) == 0) return true;
        else return false;
    }
}

class Chk {
    public static void main (String args[]){

        Chk_num e = new Chk_num();

        if (e.IsEven(10)) {
            System.out.println("Число 10 является четным");
        }

         if (e.IsEven(9))   System.out.println("Число 9 является четным");

        if (e.IsEven(8))   System.out.println("Число 8 является четным");

    }
}