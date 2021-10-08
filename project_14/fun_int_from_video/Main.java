package project_14.fun_int_from_video;

public class Main {
    public static void main (String args[]){
        SimpleGen sg = new SimpleGen(5);

        Generator gen1 = sg::getNumber;

        int temp = gen1.getNextElement();   //тут вызываются метод getNumber объекта sg

        System.out.println(temp);

    }
}
