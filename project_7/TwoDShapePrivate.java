package project_7;


public class TwoDShapePrivate {
    private double width, height;

    void showDim() {

        System.out.println("Ширина и высота равны " + width + " and " + height);
    }

    double getWidth () { //метод возвр-т ширину
        return width;
    }

    double getHeight () {  //метод возвр-т длину
        return height;
    }

    void We (double w) {

        width = w;
    }

    void He (double h) {

        height = h;
    }

    //ЕСЛИ ОСТАВИТЬ ТОЛЬКО ДВА МЕТОДА getWidth() и getHeight(), ТО В КЛАССЕ Shapes придется указывать значение переменной в скобках
}

class Triangle1 extends TwoDShapePrivate {
    private String style;

    Triangle1 (String s, double w, double h) {
        We(w);
        He(h);
        style = s;
    }


    double area () {
        return getWidth()*getHeight()/2;
    }

    void ShowStyle () {
        System.out.println("Треугольник - " + style);
    }
}

class Shapes1 {
    public static void main (String args[]){
        Triangle1 t1 = new Triangle1("закрашенный", 4, 4);
        Triangle1 t2 = new Triangle1("контурный", 8, 2);;


        //НИЖЕ БЫЛО БЫ, ЕСЛИ БЫ НЕ БЫЛО КОНСТРУКТОРА В КЛАССЕ TRIANGLE
        /*
        t1.We(4.0);
        t1.He(4.0);
        t1.s = "закрашенный";

        t2.We (8);
        t2.He (2);
        t2.style = "контурный";

*/
        System.out.println("Треугольник t1: ");
        t1.showDim();
        System.out.println("Площадь t1 равна: " + t1.area());
        t1.ShowStyle();

        System.out.println("Треугольник t2: ");
        t2.showDim();
        System.out.println("Площадь t2 равна: " + t2.area());
        t2.ShowStyle();
    }
}
