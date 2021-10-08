package project_14.fun_int_from_video;

public class Main_static {
    public static void main (String args[]){

        Generator gen1 = SimpleGen::getRandomNumber;

        int temp = gen1.getNextElement();

        System.out.println(temp);
    }
}
