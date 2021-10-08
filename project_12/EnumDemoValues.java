package project_12;

enum Transport1 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemoValues {
    public static void main (String args[]){
        Transport1 tp;                                    //объявление ссылки на перечисление

        System.out.println("Константы Transport");

        Transport1 allTransport[] = Transport1.values();   //получение массива констант типа Transport

        for (Transport1 t : allTransport){
            System.out.println(t);
        }

        /*
        or you can do it as follows:

        for (Transport t : Transport.values()){
        System.out.println(t);
        }

         */

        System.out.println();

        tp = Transport1.valueOf("AIRPLANE");
        System.out.println("tp value: " + tp);



    }
}
