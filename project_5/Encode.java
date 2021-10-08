package project_5;

public class Encode {
    public static void main (String args[]){
        String msg = "This is a test";
        String encmsg = "", dencmsg = "";
        int key = 88;

        //перебор кажлого символа и представление его с выражением key с помощью ^
        for (int i =0; i< msg.length(); i++){
            encmsg = encmsg + (char)(msg.charAt(i)^key); //шифрование
        }
        System.out.println("Зашифрованный текст: " + encmsg);

        for (int i = 0; i < encmsg.length(); i++){
            dencmsg = dencmsg + (char)(encmsg.charAt(i)^key);
        }
        System.out.println("Расшифрованный текст: " + dencmsg);
    }
}
