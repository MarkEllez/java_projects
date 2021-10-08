package project_1;

public class LogicalOpTable {
        public static void main(String args[]){
            boolean p, q;

            int k  = (p = true) ? 1:0;
            int m = (q = true) ? 1:0;


            System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

            p = true; q = true;
            System.out.print(k + "\t" + m +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println((p^q) + "\t" + (!p));


            p = true; q = false;
            System.out.print(p + "\t" + q +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println((p^q) + "\t" + (!p));

            p = false; q = true;
            System.out.print(p + "\t" + q +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println( (p^q) + "\t" + ( !p));

            p = false; q = false;
            System.out.print(p + "\t" + q +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println((p^q) + "\t" + (!p));
        }
}
