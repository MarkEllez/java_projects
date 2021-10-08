package project_5;

public class Check_5_4 {
    public static void main (String args[]){
        String strs[] = {"test", "herest", "lol", "gavno", "crab", "append", "blender"};
        int a, b;
        String t;
        int size = strs.length;

        for (a=1; a < size; a++) {

            for (b = size - 1; b >= a; b--) {
                if (strs[b - 1].compareTo (strs[b]) > 0) {
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;

                }
            }
        }
        System.out.println("Отсортированный массив: " );
        for (int i = 0; i < size; i++)
            System.out.println(strs[i]);
        System.out.println();
    }
}
