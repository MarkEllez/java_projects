package project_12;

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS;
}


public class Values_3task {
    public static void main (String args[]){

        for (Tools t : Tools.values()){
            System.out.println(t + " " + t.ordinal());
        }
    }
}
