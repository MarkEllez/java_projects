package Interview;

import java.util.Locale;

public class kolbasa {
    char ch = 'а';
    String s = "колбаса";


    static int func (char ch, String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == ch) {
                count++;
            }
            else if (s.toUpperCase().charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {

        System.out.println(func('А', "колбасА"));

    }
}
