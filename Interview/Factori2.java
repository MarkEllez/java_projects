package Interview;

public class Factori2 {
    int fact(int n) {
        int result;

        if (n == 0 | n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }

    public static void main (String args[]){
        Factori2 f = new Factori2();

        System.out.println(f.fact(12));
        System.out.println(f.fact(13));
    }
}
