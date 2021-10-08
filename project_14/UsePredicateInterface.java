package project_14;

import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main (String args[]){
        Predicate<Integer> isEven = (n) -> (n%2) == 0;

        if(!isEven.test(5))
            System.out.println("5 четное число? " + isEven.test(5));
    }
}
