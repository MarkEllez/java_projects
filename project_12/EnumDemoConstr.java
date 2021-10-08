package project_12;

enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;              //создание переменной экземпляра

    Transport2 (int s){
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}


public class EnumDemoConstr {
    public static void main (String args[]){
        Transport2 tp;

        System.out.println("Speed of airplane: " + Transport2.AIRPLANE.getSpeed());

        System.out.println("Speed of other vehicles: ");

        for (Transport2 t : Transport2.values()){
            System.out.println(t + ": " + t.getSpeed());
        }
    }
}
