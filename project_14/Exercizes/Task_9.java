package project_14.Exercizes;

import project_14.StringFunc;

public class Task_9 {

    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    };

    public static void main (String args[]){

        String inStr = "Лямбда-выражения используются оч часто";
        String outStr;

        StringFunc remove = (str) -> {
            String result = "";

            for (int i =0; i < str.length(); i++){
                if (str.charAt(i) != ' ')
                    result = result + str.charAt(i);
            }
            return result;
        };

        outStr = changeStr(remove, inStr);

        System.out.println(outStr);

    }
}