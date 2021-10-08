package project_13.QueueLastExc_13;

import project_13.QueueLastExc_13.IGenQ;
import project_13.QueueLastExc_13.QueueEmptyException;
import project_13.QueueLastExc_13.QueueFullException;

public class GenQueue<T> implements IGenQ<T> {
    private T q[];

    private int putloc, getloc;

    public GenQueue(T[] aRef){                      //создание пустой очереди из заданного массива
        q = aRef;
        putloc = getloc = 0;
    }

    public void put (T obj)                         //поместить элемент в очередь
            throws QueueFullException {

        if (putloc == q.length-1)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    public T get()                                  //извлечь элемент из очереди
            throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];

    }
}
