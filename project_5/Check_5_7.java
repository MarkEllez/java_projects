package project_5;

public class Check_5_7 {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "", dencmsg = "";
        String key = "abcdefgi";
        int j;

        j = 0;

        //перебор каждого символа и представление его с выражением key с помощью ^
        for (int i = 0; i < msg.length(); i++) {
                encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j)); //шифрование
            j++;
            if (j == key.length()) j = 0;
        }
        System.out.println("Зашифрованный текст: " + encmsg);

        j = 0;
        for (int i = 0; i < encmsg.length(); i++){
            dencmsg = dencmsg + (char)(encmsg.charAt(i)^key.charAt(j));
            j++;
            if (j == key.length())  j =0;
        }
        System.out.println("Расшифрованный текст: " + dencmsg);

    }


    }


