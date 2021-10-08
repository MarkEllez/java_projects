package project_12;


enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}


public class EnumDemo {
    public static void main (String args[]){
        Transport tp;

        tp = Transport.AIRPLANE;

        System.out.println("Значение tp: " + tp);
        System.out.println();


        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN){
            System.out.println("tp содержит TRAIN\n");
        }

        switch (tp) {
            case CAR:
                System.out.println("машинки");
                break;
            case BOAT:
                System.out.println("boats");
                break;
            case TRAIN:
                System.out.println("trains");
                break;
            case TRUCK:
                System.out.println("trucks");
                break;
            case AIRPLANE:
                System.out.println("airplanes");
                break;
        }
    }


}
