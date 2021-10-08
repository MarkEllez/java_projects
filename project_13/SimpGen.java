package project_13;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes(){
        System.out.println("Тип T - это класс " + ob1.getClass().getName());
        System.out.println("Тип V - это класс " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

}

public class SimpGen {
    public static void main (String args[]){
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Test");

        tgObj.showTypes();        //отобразить типы

        int i = tgObj.getOb1();
        System.out.println("значение: " + i);

        String str = tgObj.getOb2();
        System.out.println("значение: " + str);
    }
}
