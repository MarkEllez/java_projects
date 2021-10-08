package project_13.QueueLastExc_13;

public class GenQDemo {
    public static void main(String args[]) {

        // Создать очередь для хранения целых чисел
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Дeмoнcтpaции очереди чисел типа Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Дoбaвлeниe " + i + " в очередь q");
                q.put(i);       // добавить целочисленное значение в очередь q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }


        //Очередь для хранения чисел с плавающей точкой

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("Демонстрация очереди чисел типа Double");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление в очередь q2 числа " + (double) i / 2);
                q2.put((double) i / 2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Излечение из очереди q2 числа: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }


        // Создать КОЛЬЦЕВУЮ очередь для хранения целых чисел
        Integer iStore1[] = new Integer[10];
        GenCircularQueue<Integer> q1 = new GenCircularQueue<>(iStore1);

        Integer iVal2;

        System.out.println("Дeмoнcтpaции очереди чисел типа Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Дoбaвлeниe " + i + " в очередь q");
                q1.put(i);       // добавить целочисленное значение в очередь q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal2 = q1.get();
                System.out.println(iVal2);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }


}