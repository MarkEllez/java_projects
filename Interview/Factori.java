package Interview;

public class Factori {
    int fact (int n){
        int result = 1;


        for (int i = 1; i <= n; i++){
            result = result*i;
        }
        return result;
    }

    public static void main (String args[]){
        Factori f = new Factori();

        System.out.println(f.fact(3));
    }
}
