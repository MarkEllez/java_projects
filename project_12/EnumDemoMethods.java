package project_12;

enum Transport4 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT;
}


public class EnumDemoMethods {
    public static void main (String args[]){
        Transport4 tp, tp1, tp2;

        System.out.println("Constants");

        for (Transport4 t : Transport4.values()){
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transport4.AIRPLANE;
        tp1 = Transport4.TRAIN;
        tp2 = Transport4.AIRPLANE;

        if (tp.compareTo(tp2) == 0){
            System.out.println(tp + " = " + tp2);
        }

        if (tp.compareTo(tp2) > 0){
            System.out.println(tp2 + "идет перед" + tp);
        }

        if (tp.compareTo(tp2) < 0){
            System.out.println(tp + "идет перед" + tp2);
        }
    }
}
