package project_13.GenStack12;

import project_9.Stack9;

//исключение о переполнении очереди
class StackFullException extends Exception {
    int size;

    StackFullException (int s) {
        size = s;
    }

    public String toString () {
        return "\n Stack is full. Max size is " + size;
    }
}

//исключение о пустоте очереди
class StackEmptyException extends Exception {

    public String toString(){
        return "\n Stack is empty.";
    }
}


class GenStack<T> implements IGenStack<T> {
    private T stck[]; // массив для хранения элементов стека
    private int tos; // индексы вставляемых и извлекаемых элементов

    //определяем размер стека
    GenStack (T[] stckArray) {
            stck = stckArray;
            tos = 0;
    }

    // построить один стек из другого стека
    GenStack(T[] stckArray, GenStack<T> ob){
        tos = ob.tos;
        stck = stckArray;

        try {
            if (stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        }
        catch (StackFullException exc){
            System.out.println(exc);
        }
    }

    // построить стек с исходными значениями
    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }



    // поместить символы в стек
    public void push(T obj) throws StackFullException {
        if(tos==stck.length)
            throw new StackFullException(stck.length);

        stck[tos] = obj;
        tos++;
    }

    // извлечь символы из стека
    public T pop()
            throws StackEmptyException {
        if(tos==0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}

// продемонстрировать применение класса Stack
class GenStack12 {
    public static void main(String args[]) {
        // создать пустой стек на 10 элементов
        Integer iStore[] = new Integer[10];
        GenStack<Integer> stk1 = new GenStack<>(iStore);


        // построить стек из массива
        String name[] = {"One", "Two", "Three"};
        String strStore[] = new String[3];

        GenStack<String> stk2 = new GenStack<>(strStore, name);

        String str;
        int n;

        try {
            for (int i = 0; i < 10; i++) {
                stk1.push(i);
            }
        } catch (StackFullException exc) {
            System.out.println(exc);
        }


        // построить один стек из другого стека

        String strStore2[] = new String[3];
        GenStack<String> stk3 = new GenStack<>(strStore2, stk2);


        // отобразить стеки


        try {
            System.out.print("Contents of stkl: ");
            for (int i = 0; i < 10; i++){
                n = stk1.pop();
                System.out.println(n);
            }

            System.out.print("Contents of stk2: ");
            for (int i =0; i < 3; i++){
                str = stk2.pop();
                System.out.println(str);
            }

            System.out.print("Contents of stk3: ");
            for (int i = 0; i < 3; i++){
                str = stk3.pop();
                System.out.println(str);
            }
        }
        catch (StackEmptyException exc){
            System.out.println(exc);
        }

    }
}



