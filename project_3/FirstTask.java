package project_3;

public class FirstTask {
    public static void main (String args[])
        throws java.io.IOException {
            char choice, ignore;
            int sum = 0;

            do {
                System.out.print("Введите символ: ");
                choice = (char)  System.in.read();

                if (choice == ' ') {
                    sum++;
                }


                do {
                    ignore = (char) System.in.read();
                }
                while (ignore != '\n');
            }
            while (choice != '.');

            System.out.println("Цикл завершен!" + '\n' +"Количество пробелов = " + sum);
        }
}
