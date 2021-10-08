package project_3;

public class CaseChg {
    public static void main (String args[])
        throws java.io.IOException {

        char ch ;
        int changes = 0;
        System.out.print("Введите любой символ: ");
        do {
            ch = (char)System.in.read();


            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if (ch >= 'A' & ch <= 'Z'){
                ch +=32;
                changes++;
            }

        }
        while(ch != '.');
        System.out.println("Кол-во введеных символов:" + changes);
    }
}

