package project_7;

public class TwoDShape3 {
    private double width, height;

    TwoDShape3 (){  //констуктор без параметров
        width = 0;
        height = 0;
    }

    TwoDShape3 (double w, double h){
        height = h;
        width = w;
    }

    TwoDShape3 (double x) {
        width = x;
        height = x;
    }

    TwoDShape3 (TwoDShape3 ob){
        width = ob.width;
        height = ob.height;
    }

    double getWidth(){
        return width;
    }

    double getHeight () {
        return height;
    }


    void setWidth (double w) {
        width = w;
    }

    void setHeight (double h) {
        height = h;
    }


    void ShowDim () {
        System.out.println("Ширина и высота = " + width + " " + height);
    }
}

class Triangle3 extends TwoDShape3 {

    private String style;

    Triangle3 () {
        super();
        style = "none";
    }

    Triangle3 (String s, double w, double h){
        super(w, h);
        style = s;
    }

    Triangle3 (double x){
        super(x);
        style = "закрашенный";
    }

    Triangle3 (Triangle3 ob){
        super(ob);  // передача -ссылки на объект Triangle3- конструктору класса TwoDShape
        style = ob.style;
    }

    double area1 () {
        return getWidth()*getHeight()/2;
    }

    void ShowStyle () {
        System.out.println("Треугольник " + style);
    }

}

class Shapes7 {
    public static void main(String args[]) {
        Triangle3 t1 = new Triangle3("контурный", 13, 12);
        // создать копию объекта tl
        Triangle3 t2 = new Triangle3(t1);

        System.out.println("Инфopмaция о tl: ");

        t1.ShowStyle();
        t1.ShowDim();
        System.out.println("Плoщaдь - " + t1.area1());

        System.out.println();

        System.out.println("Инфopмaция о t2: ");

        t2.ShowStyle();
        t2.ShowDim();
        System.out.println("Плoщaдь - " + t2.area1());
    }
}

/*
Конструктор TwoDShape () инициализирует лишь те части передаваемого
ему объекта подкласса, которые являются членами класса TwoDShape,
и поэтому не имеет значения, содержит ли этот объект дополнительные члены,
добавленные в производных подклассах.


 */