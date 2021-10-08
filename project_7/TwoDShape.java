package project_7;

public class TwoDShape {
    double width, height;

    void showDim() {
        System.out.println("Ширина и высота равны " + width + " and " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    double area () {
        return width*height/2;
    }

    void ShowStyle () {
        System.out.println("Треугольник - " + style);
    }
}

class Shapes {
    public static void main (String args[]){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();


        t1.height = 4;
        t1.width = 4;
        t1.style = "закрашенный";

        t2.height = 8;
        t2.width = 2;
        t2.style = "контурный";


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