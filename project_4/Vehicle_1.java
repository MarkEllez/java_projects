package project_4;

public class Vehicle_1 {
    int passengers;
    int fuelcap;
    int mpg;

    void range(){
        System.out.println("Дальность поездки составит " + fuelcap*mpg + " миль.");
    }
}

class MathEx {
    public static void main(String args[]) {
        Vehicle_1 minivan = new Vehicle_1();
        Vehicle_1 sportscar = new Vehicle_1();

        int range1, range2;

        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        minivan.range();
        sportscar.range();
    }
}
