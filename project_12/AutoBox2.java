package project_12;

public class AutoBox2 {
    static void m (Integer v){                    //принимает параметр типа Integer
        System.out.println("m() получил " + v);
    }

    static int m2(){                              //возвращает значение типа int
        return 10;
    }

    static Integer m3(){
        return 99;
    }

    public static void main (String args[]){
        m(199);             //методу m передается значение типа int, метод m принимает параметр Integer v - значение типа int автом упаков

        Integer iOb = m2();           //объект iOb получает значение типа int
        System.out.println("Значение, возвращаемое из m2() " + iOb);

        int i = m3();   //метод m3() возвращает значение типа Integer, которое автоматически распаковывается и преобразуется в тип int
        System.out.println("Значение, возвращенное из m3(): " + i);


        iOb = 100;
        System.out.println("Корень квадратный из iOb: " + Math.sqrt(iOb));    //распаковка объекта iOb методом Math.sqrt()

    }
}
