package project_6;

public class Stack {
    private char stck [];
    private int tos; //вершина стека

    //определяем размер стека
    Stack (int size) {
        stck = new char [size];
        tos = 0;
    }

    // построить один стек из другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        // скопировать элементы
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // построить стек с исходными значениями
    Stack(char a[]) {
        stck = new char[a.length];
        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // поместить символы в стек
    void push(char ch) {
        if(tos==stck.length) {
            System.out.println(" — Stack is full.");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    // извлечь символы из стека
    char pop() {
        if(tos==0) {
            System.out.println(" — Stack is empty.");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}

// продемонстрировать применение класса Stack
class SDemo {
    public static void main(String args[]) {
        // создать пустой стек на 10 элементов
        Stack stkl = new Stack(10);
        char name[] = {'T', 'o', 'm'};

        // построить стек из массива
        Stack stk2 = new Stack(name); //поместили массив в стек stk2
        char ch;
        int i;

        // поместить символы в стек stkl
        for(i=0; i < 10; i++)
            stkl.push((char) ('A' + i));

        // построить один стек из другого стека
        Stack stk3 = new Stack(stkl);

        // отобразить стеки
        System.out.print("Contents of stkl: ");
        for(i=0; i < 10; i++) {
            ch = stkl.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk2: ");
        for(i=0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk3: ");
        for(i=0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
