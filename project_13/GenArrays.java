package project_13;

class Gen12<T extends Number> {
    T ob;

    T vals[];       //создавать массив типа T можно

    Gen12(T o, T nums[]){
        ob = o;

//        vals = new T[10];     //невозможно создать массив типа T

        vals = nums;            //присвоение ссылки на сущ-щий массив возможно


    }
}


public class GenArrays {
    public static void main (String args[]){
        Integer n[] = {1, 2, 3, 4, 5};

        Gen12<Integer> iOb = new Gen12<>(50, n);


    }
}
