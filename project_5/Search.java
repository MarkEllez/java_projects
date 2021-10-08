package project_5;

public class Search {
    public static void main(String args[]){
        int nums[] = {4, 6, 77, 3, 5, 1, 55};
        boolean found = false;
        int val = 5;

        for (int x: nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("значение найдено");
        }
    }

}
