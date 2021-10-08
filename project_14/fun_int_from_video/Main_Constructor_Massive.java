package project_14.fun_int_from_video;

public class Main_Constructor_Massive {
    public static void main (String args[]){

        Generator_Constructor_Massive gen = int[]::new;

        Object a = gen.createNewObject(10);

        System.out.println(a.getClass());

    }
}
