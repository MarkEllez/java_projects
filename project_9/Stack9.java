package project_9;

class FullQExc extends Exception {
    int sz;

    FullQExc (int s){
        sz = s;
    }

    public String toString () {
        return "Переполненная очередь имеет размер: " + sz;
    }
}

class EmptyQExc extends Exception {
    public String toString() {
        return "\n Очередь пуста";
    }
}


public class Stack9 {
    private char stck [];
    private int tos; //вершина стека

    //определяем размер стека
    Stack9 (int size) {
        stck = new char [size];
        tos = 0;
    }

    // построить один стек из другого стека
    Stack9(Stack9 ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        // скопировать элементы
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // построить стек с исходными значениями
    Stack9(char a[]) {
        stck = new char[a.length];
        for(int i = 0; i < a.length; i++) {
           try {
               push(a[i]);
           }
           catch (FullQExc exc){
               System.out.print(exc);
           }
        }
    }

    // поместить символы в стек
    void push(char ch)
        throws FullQExc {
        if(tos==stck.length)
            throw new FullQExc(stck.length);


        stck[tos] = ch;
        tos++;
    }

    // извлечь символы из стека
    char pop()
        throws EmptyQExc {
            if(tos==0) {
                throw new EmptyQExc();
            }
            tos--;
            return stck[tos];
    }
}

// продемонстрировать применение класса Stack
class SDemo {
    public static void main(String args[]) {
        // создать пустой стек на 10 элементов
        Stack9 stkl = new Stack9(10);
        char name[] = {'T', 'o', 'm'};

        // построить стек из массива
        Stack9 stk2 = new Stack9(name); //поместили массив в стек stk2
        char ch;
        int i;

        // поместить символы в стек stkl
        for (i = 0; i < 10; i++)
            try {
                stkl.push((char) ('A' + i));
            } catch (FullQExc exc) {
                System.out.print(exc);
            }

        // построить один стек из другого стека
        Stack9 stk3 = new Stack9(stkl);

        // отобразить стеки
        System.out.print("Contents of stkl: ");
        for (i = 0; i < 10; i++) {
            try {
                ch = stkl.pop();
                System.out.print(ch);
            } catch (EmptyQExc exc) {
                System.out.print(exc);
            }
        }

        System.out.println("\n");

        System.out.print("Contents of stk2: ");
        for (i = 0; i < 3; i++) {
            try {
                ch = stk2.pop();
                System.out.print(ch);
            } catch (EmptyQExc exc) {
                System.out.print(exc);
            }
        }

            System.out.println("\n");

            System.out.print("Contents of stk3: ");
            for (i = 0; i < 10; i++) {
                try {
                    ch = stk3.pop();
                    System.out.print(ch);
                }
                catch (EmptyQExc exc){
                    System.out.print(exc);
                }
            }
        }
    }







