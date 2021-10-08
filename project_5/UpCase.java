package project_5;

public class UpCase {
    public static void main (String args[]){
        int i;
        char ch;

        for (i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);


            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }
    }
}
