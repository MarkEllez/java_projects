package project_14.fun_int_from_video;

public class Main_IntGenerator {
    public static void main (String args[]){

        IntGenerator ig = new IntGenerator();

        Generator1 gen1 = IntGenerator::next;

        System.out.println(gen1.getNextElement(ig));
    }
}
