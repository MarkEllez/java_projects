package project_7;

 class TwoDShape4 {
     private double width, height;

     TwoDShape4 (double w, double h) {
         width = w;
         height = h;

     }

     TwoDShape4 (double x) {
         width = height = x;
     }

     double getWidth () {
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

     double area (){
         System.out.println();
         return 0;
     }
}



 class Circle extends TwoDShape4 {

     Circle (double w, String s) {
         super (w);
         s = "закрашенный";
     }

     double area() {
        super.area();
        return (getWidth()*2)*(getWidth()*2)*3.14;
     }
}

class Shapes4 {
     public static void main (String args[]){
        Circle ob = new Circle (1.5, "чел");

        System.out.println(ob.area());

     }
}
