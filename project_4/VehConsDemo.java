package project_4;



 class Vehicle1 {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle1 (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    double Rang() { //метод вовзращает дальность поездки (расстояние)
       return fuelcap*mpg;
    }

    double FuelNeeded (int miles){ //требумое кол-во топлива
        return (double) miles/mpg;
    }

}


public class VehConsDemo {
        public static void main (String args[]){
            int dist = 200;
            double range, gallons;
            Vehicle1 minivan = new Vehicle1(7,20,12);
            Vehicle1 sportscar = new Vehicle1(2, 30, 20);

            range = minivan.Rang();

            System.out.println("Минивен преодолеет расстояние " + range + " миль");

            range = sportscar.Rang();

            System.out.println("Спорткар преодолеет расстояние " + range + " миль");

            gallons = minivan.FuelNeeded(dist);

            System.out.println("Минивену понадобится " + gallons + " литров");

            gallons = sportscar.FuelNeeded(dist);
            System.out.println("Спорткару понадобится " + gallons + " литров");



        }
}
