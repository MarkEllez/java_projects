package project_14.fun_int_from_video;

import java.util.ArrayList;

public class Main_Constructor {
    public static void main (String args[]){
        Generator_Constructor gen = ArrayList::new;    //ссылка на конструктор класса ArrayList

        Object a = gen.createNewObject();       //просто присваиваем переменной a класса Object вызов метода функц интерфейса для объекта интерфейса

        System.out.println(a.getClass());        //вызывается метод класса getClass() для объекта a

    }
}
