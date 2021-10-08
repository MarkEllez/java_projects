package project_4;

public class Fuel {
    int passengers;
    int fuelcap;
    int mpg;

    double FuelNeeded (int miles){
        return (double) miles/mpg;
    }
}

class Fuel_N {
    public static void main (String args[]){
        int dist = 200;
        double gallons_m;
        double gallons_s;

        Fuel minivan = new Fuel();
        Fuel sportscar = new Fuel();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 4;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons_m = minivan.FuelNeeded(dist);
        gallons_s = sportscar.FuelNeeded(dist);

        System.out.println("Фургон потратит " + gallons_m + " на поездку");

        System.out.println("Спорт тачка потратит " + gallons_s + " на поездку");


    }

}
