package project_13.QueueLastExc_13;

class GenCircularQueue<T> implements IGenQ<T>{
    private T q[];

    private int getloc, putloc;


    public GenCircularQueue (T[] cRef) {
        q = cRef;
        putloc = getloc = 0;
    }


    /* Очередь считается полной, если индекс putloc на единицу
меньше индекса getloc или если индекс putloc указывает
на конец массива, а индекс getloc - на его начало */

    public void put(T obj)
            throws QueueFullException {

        if ((putloc + 1 == getloc)|
        ((getloc == 0)&(putloc == q.length - 1))){
            System.out.println("\nОчередь заполнена");
        }

        putloc++;
        if (putloc == q.length) {
            putloc = 0; // перейти в начало массива
        }

        q[putloc] = obj;
    }


    public T get()
            throws QueueEmptyException{
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
        }
        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }

}
