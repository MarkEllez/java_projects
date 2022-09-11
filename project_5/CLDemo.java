package project_5;

public class CLDemo {
    public static void main (String args[]){
        System.out.println("The app is received " + args.length + " number of args");

        System.out.println("The list of args: ");
        for (int i =0; i < args.length; i++){
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }

}
