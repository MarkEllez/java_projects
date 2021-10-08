package project_13.QueueLastExc_13;

public class QueueFullException extends Exception{
    int size;

    QueueFullException (int s){
        size = s;
    }

    public String toString() {
        return "\nОчередь заполнена из массива размером " + size;
    }
}


