package project_11;

//исключение о переполнении очереди
class QueueFullException1 extends Exception {
    int size;

    QueueFullException1 (int s) {
        size = s;
    }

    public String toString () {
        return "\n Очередь заполнена. Максимальный размер очереди " + size;
    }
}

//исключение о пустоте очереди
class QueueEmptyException1 extends Exception {

    public String toString(){
        return "\n Очередь пуста.";
    }
}

/*
Исключение QueueFullException генерируется при попытке поместить элемент
в уже заполненную очередь, а исключение QueueEmptyException - в ответ на
попытку извлечь элемент из пустой очереди.

 */

class FixedQueue implements ICharQ11 {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(char ch)
            throws QueueFullException1 {
        if (putloc == q.length - 1)
            throw new QueueFullException1(q.length - 1);

        putloc++;
        q[putloc] = ch;

    }

    // Извлечь символ из очереди
    public char get()
            throws QueueEmptyException1 {

        if (getloc == putloc)
            throw new QueueEmptyException1();

        getloc++;
        return q[getloc];
    }

    public void reset() {
        putloc = getloc = 0;
    }
}

class MyThread12 implements Runnable {
    Thread thrd;

    MyThread12(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {

        System.out.println("Запуск " + thrd.getName());

        try {
            Thread.sleep(500);

        }
        catch (InterruptedException exc){
            System.out.println("Прерывание " + thrd.getName());
        }

        System.out.println("Завершение потока " + thrd.getName());
    }
}


public class QueueEx12 {
    public static void main (String args[]){
        FixedQueue q = new FixedQueue(10);

        char ch;
        int i;

        MyThread12 mt = new MyThread12("Child#1");

        //попытка положить символ в полную очередь
        try {
            for (i = 0; i < 11; i++){
                System.out.print("Попытка сохранения " + (char)('A' + i));

                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException1 exc){
            System.out.println(exc);
        }

        //попытка вынуть символ из пустой очреди
        try {
            for (i = 0; i < 11; i++){
                System.out.println("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException1 exc){
            System.out.println(exc);
        }
        for (i = 0; i < 50; i++){
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Завершение основного потока");

    }
}