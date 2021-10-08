package project_7;

public class Inh {
        Inh () {
            System.out.println("A");
        }
    }

    class B1 extends Inh {
        B1 () {
            System.out.println("B");
        }
    }

    class C1 extends B1 {
        C1 () {
            System.out.println("C");
        }
    }

    class Displ {
        public static void main (String args[]){
            C1 ob = new C1();
        }
    }

