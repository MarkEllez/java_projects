package project_13;

class Gen1<T> {
    T ob;                   //объявление объекта типа T

    Gen1 (T o) {
        ob = o;
    }

    T getOb(){              //вернуть объект ob
        return ob;
    }

}

public class RawDemo {
    public static void main (String args[]){
        Gen1<Integer> iOb = new Gen1<>(88);             //создание объекта класса Gen1 типа Integer

        Gen1<String> strOb = new Gen1<>("Test");        //создание объекта класса Gen1 типа String

        Gen1 raw = new Gen1(new Double (2.5));       //создание объекта базового типа

        double d = (Double) raw.getOb();      //объявляем переменную и даем ей значение = имя_объекта.имя_метода

        System.out.println(d);
    }
}
