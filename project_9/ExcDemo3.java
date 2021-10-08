package project_9;

public class ExcDemo3 {
    public static void main (String args[]){
        int nums1[] = {2, 5, 6, 8, 10};
        int nums2[] = {3, 0, 6, 9, 0};

        for (int i = 0; i < nums1.length; i++){
            try {
                System.out.println(nums1[i]/nums2[i]);
            }

            catch (ArithmeticException exc) {
                System.out.println("Деление на нуль!");
            }
        }
    }
}
