 class InchToMetre {
    public static void main(String args[]){
        double metre, inch;
        int counter;

        counter = 0;

        for (inch = 1; inch == 12*39.37; inch++){

            metre = inch*39.37;
            System.out.println(inch + "inches correspond to " + metre + " metres");
            counter++;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }


    }

 }