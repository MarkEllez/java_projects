/*
package project_13.QueueLastExc_13;

public class GenDynQueue<T> implements IGenQ<T> {
    private T q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public GenDynQueue (T[] dRef)
          {
            q = dRef; // выделить память для очереди
            putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(T obj) throws QueueFullException {
        if (putloc == q.length - 1) {
            T t[] = new T[q.length*2]; // увеличить размер очереди
// Скопировать элементы в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;

        }
        putloc++;
        q[putloc] = obj;

    }

    // Извлечь символ из очереди
    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}



 */