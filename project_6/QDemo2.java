package project_6;


  class Queue2 {
    private char q[];
    private int getloc, putloc; //getloc - кол-во элементов ИЗ ОЧЕРЕДИ
                                //putloc - кол-во элементов В ОЧЕРЕДЬ

     Queue2 (int size) {
        q = new char [size+1];  //инициализируется массив
        putloc = getloc = 0; //инициализируются переменные
    }

     Queue2 (Queue2 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char [ob.q.length];  //инициализируется массив на основании объекта ob


        for(int i = getloc+1; i <= putloc; i++) //копирование элементов очереди
            q[i] = ob.q[i] ;
    }

     Queue2 (char a[]){ //создается очередь для хранения символов из массива а
        putloc = 0;
        getloc = 0;
        q = new char [a.length + 1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }


    void put (char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    char get () {
        if (getloc == putloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];

    }
}



class QDemo2 {
    public static void main(String args[]) {
        Queue2 q1 = new Queue2(10); // Создать пустую очередь для хранения 10 элементов
        char name[] = {'Т', 'o', 'm'};

        Queue2 q2 = new Queue2(name); // Создать очередь на основе массива

        char ch;
        int i;

        for (i = 0; i < 10; i++) {
            q1.put((char) ('А' + i));  // Поместить ряд символов в очередь ql
        }

        Queue2 qЗ = new Queue2(q1);


        // Показать очереди
        System.out.print("Coдepжимoe ql: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Coдepжимoe q2: ");

        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Coдepжимoe qЗ: ");

        for (i = 0; i < 10; i++) {
            ch = qЗ.get();
            System.out.print(ch);
        }

    }
}