package project_13.QueueLastExc_13;

public interface IGenQ<T> {
    void put (T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}
