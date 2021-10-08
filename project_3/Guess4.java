package project_3;

public class Guess4 {
    public static void main(String args[])
        throws java.io.IOException {
            char ch, ignore, answer = 's';

           System.out.println("Буква загадана в диапзаоне от a до z");

            do {

                    System.out.println("Попытайтесь ее угадать: ");

                    ch =(char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                        }
                    while (ignore !='\n');

                    if (ch == answer) {
                        System.out.println("Буква угадана!");
                    }
                    else {
                        System.out.println("Попробуйте еще раз!");
                        if (ch < answer){
                            System.out.println("Нужная буква находится ближе к концу алфавита");
                        }
                        else {
                            System.out.println("Нужная буква находится ближе к началу алфавита");
                        }
                    }
            }
            while (answer != ch);

    }
}
