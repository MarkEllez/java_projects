package project_9;

public class ExcDemo4 {
    public static void main(String args[]) {
        int nums1[] = {2, 5, 6, 8, 10, 5, 8, 2};
        int nums2[] = {3, 0, 6, 9, 0};

        for (int i = 0; i < nums1.length; i++) {

            try {
                System.out.println(nums1[i]/nums2[i]);
            }
            catch (ArithmeticException exc){
                System.out.println("Делить на 0 нельзя, кусок говна!");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Выход за пределы массива");
            }
        }
    }
}


