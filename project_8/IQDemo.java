package project_8;

class FixedQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) { // очередь меньше массива на 1
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    public void reset() {
        putloc = getloc = 0;
    }
}


// Кольцевая очередь - при удалении символов из очереди освобождается место для новых элементов
class CircularQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов


    // Создать пустую очередь заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(char ch) {
/* Очередь считается полной, если индекс putloc на единицу
меньше индекса getloc или если индекс putloc указывает
на конец массива, а индекс getloc - на его начало */
        if (putloc + 1 == getloc |
                ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        if (putloc == q.length) {
            putloc = 0; // перейти в начало массива
        }
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }

    public void reset() {
        putloc = getloc = 0;
    }
}


//Динамическая кольцевая очередь
class DCirc implements ICharQ {
    private char q[];
    private int putloc, getloc;

    //Создать пустую очередь

    public DCirc (int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }


    public void put(char ch) {
        if ((putloc + 1 == getloc) |
                ((putloc == q.length - 1) & (getloc == 0)) ) {

            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                q[i] = t[i];
                 q = t;
        }

        putloc++;
        if (putloc == q.length) {
            putloc = 0; // перейти в начало массива
        }
        q[putloc] = ch;

    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }

    public void reset() {
        putloc = getloc = 0;
    }
}


// Динамическая очередь
class DynQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

// Создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

// Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            char t[] = new char[q.length * 2]; // увеличить размер очереди
// Скопировать элементы в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
                q = t;

        }
            putloc++;
            q[putloc] = ch;

    }

// Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    public void reset() {
        putloc = getloc = 0;
    }
}


class IQDemo {


    public static void main(String args[]) {

        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        DCirc q4 = new DCirc(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;

        // Поместить ряд символов в очередь фиксированного размера
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('А' + i));
        }

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q2;

        // Поместить ряд символов в динамическую очередь
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;

        // Поместить ряд символов в кольцевую очередь
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('А' + i));
        }

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();


        // Поместить больше символов в кольцевую очередь
        for (i = 10; i < 20; i++) {
            iQ.put((char) ('А' + i));
        }
        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nCoxpaнeниe и использование данных" + " кольцевой очереди");

        // Поместить символы в кольцевую очередь и извлечь их оттуда
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('А' + i));
            ch = iQ.get();
            System.out.print(ch);
        }


        System.out.println();

        iQ = q4;

        // Поместить ряд символов в очередь дин-кол размера
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('А' + i));
        }

        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe дин-кол. очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        // Поместить больше символов в дин-кол очередь
        for (i = 10; i < 20; i++) {
            iQ.put((char) ('А' + i));
        }
        // Отобразить содержимое очереди
        System.out.print("Coдepжимoe дин-кол очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nCoxpaнeниe и использование данных" + " дин-кол. очереди");

        // Поместить символы в кольцевую очередь и извлечь их оттуда
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('А' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nОчередь после сброса: ");

        iQ.reset();

        System.out.println(iQ.get());

       // iQ.copyQueue();

    }

}