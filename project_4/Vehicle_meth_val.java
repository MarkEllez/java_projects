package project_4;

public class Vehicle_meth_val {
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap*mpg;
    }
}

class Math_1 {
    public static void main (String args[]){
        int range_1, range_2;

        Vehicle_meth_val minivan = new Vehicle_meth_val();
        Vehicle_meth_val sportscar = new Vehicle_meth_val();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range_1 = minivan.range();
        range_2 = sportscar.range();

        System.out.println("Фургон проедет " + range_1 + " миль.");

        System.out.println("Спорткар проедет " + range_2 + " миль.");
    }
}
