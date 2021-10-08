package project_14.First_lymbda_ex;

public class LambdaMassive {
    public static void main (String args[]){
        double t[] = {1.5, 2.4, 3.75};

        MyTransform<Double> l = (a) -> {
            for (int i = 0; i < a.length; i++)
                a[i] = Math.sqrt(a[i]);

            return;
        };

        //System.out.println( l.Transform(t));
    }
}
