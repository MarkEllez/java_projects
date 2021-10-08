package project_6;

public class Factorial {

    int FactR (int n){ //РЕКУРСИВНЫЙ ПОДХОД
        int result;

        if (n==1) return 1;
        else
            result = FactR(n-1)*n ; //метод используется внутри себя самого

        return result;
    }

    int fac (int n){ // НЕРЕКУРСИВНЫЙ ПОДХОД
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++){
            result = result * t;
        }

    return result;
    }


}

class Res {
    public static void main (String args[]){
        Factorial ob = new Factorial();

        System.out.println(ob.FactR(5) + " " + ob.fac(5));
    }
}