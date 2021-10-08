package project_13;

interface Containment<T>{
    boolean contains(T o);
}

class MyClass<T> implements Containment<T>{
    T[] arrayRef;

    MyClass(T[] o){
        arrayRef = o;
    }

    public boolean contains (T o){
        for (T x: arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}

public class GenInterfaceDemo {
    public static void main (String args[]){
        Integer x[] = {1, 2, 3};

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if (ob.contains(2))
            System.out.println("массив содержит 2");
        else
            System.out.println("массив не содержит 2");

        if (ob.contains(3))
            System.out.println("массив содержит 3");
        else
            System.out.println("массив не содержит 3");


        if (ob.contains(5))
            System.out.println("массив содержит 5");
        else
            System.out.println("массив не содержит 5");

      /*
        if (ob.contains(2.5))
            System.out.println("массив содержит 2.5");
        else
            System.out.println("массив не содержит 2.5");
        */ //недопустимо, так как объект ob реализует Containment для типа Integer

    }
}
