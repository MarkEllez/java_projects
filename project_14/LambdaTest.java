package project_14;

public class LambdaTest {

    static String stringStr (StringFunc str, String s){
        return str.func(s);
    }

    public static void main (String args[]){
        String outstr;
        String instr = "Java";

        StringFunc reverse = str -> {
            String result = "";

            for (int i = instr.length()- 1; i >= 0; i--){
                result += str.charAt(i);

            }

            return result;
        };

        outstr = stringStr(reverse, instr);

        System.out.println(outstr);
    }
}
