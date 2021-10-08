package project_7;


class Vehicle implements IVehicle{
    private int passengers; // количество пассажиров
    private int fuelcap; // объем топливного бака в галлонах
    private int mpg; // потребление топлива в милях на галлон

    Vehicle(int р, int f, int m) {
        passengers = р;
        fuelcap = f;
        mpg = m;
    }

   public int range(){    //метод возвращает дальность поездки
        return mpg * fuelcap;
    }

   public double fuelneeded (int miles) {
        return (double) miles / mpg;
    }


    // Методы доступа к переменным экземпляра
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int р) {
        passengers = р;
    }

    int getFuelcap () {
        return fuelcap;
    }

    void setFuelcap (int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg (int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    Truck(int р, int f, int m, int с) {
        super (р, f, m); //инициализация членов класса
        cargocap = с;
    }

    int getCargo() {
        return cargocap;
    }

    void putcargo(int с) {
        cargocap = с;
    }
}


public class TruckDemo {
    public static void main(String args[]) {
// Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Гpyзoвик может перевезти " + semi.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикaп может перевезти " + pickup.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");
    }
}