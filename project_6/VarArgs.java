package project_6;

public class VarArgs {

    static void Arg (int ... v){
        System.out.println("Koличecтвo аргументов: "+ v.length);

        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    public static void main (String args[]){

        Arg(10);
        Arg(5, 3, 2);
        Arg();
    }

}
