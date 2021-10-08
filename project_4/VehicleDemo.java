package project_4;

 class Vehicle {
     int passengers;
     int fuelcap;
     int mpg;
 }
        //В этом классе объявляется объект типа Vehicle
         class VehicleDemo {
            public static void main(String args[]){
                Vehicle minivan = new Vehicle ();
                int range;

                minivan.passengers = 7;
                minivan.fuelcap = 16;
                minivan.mpg = 21;

                //Рассчитать дальность поездки при полном баке
                range = minivan.fuelcap*minivan.mpg;

                System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров на расстояние "
                + range + " миль");
            }
        }
