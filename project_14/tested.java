package project_14;



enum Trans {
    CAR(200), TRUCK(100), BUS(110);

    int speed;

    Trans (int speed) {
        this.speed = speed;
    }

    int getSpeed(){
        return speed;
    }
}



public class tested {
    public static void main (String args[]){
        Trans tp;

        System.out.println(Trans.BUS.getSpeed());

        for (Trans t : Trans.values()){
            System.out.println(t);

        }
    }
}