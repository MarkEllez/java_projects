package project_6;

public class FailSoftArray {
    private int a[]; //закрытый массив a
    private int errval; //возвр-т ошибку через метод get
    public int length;

    //ОПРЕДЕЛЕНИЕ КОНСТРУКТОРА

    public FailSoftArray (int size, int errv){
        a = new int[size]; //инициализируем массив
        errval = errv;
        length = size;
    }

    //метод возвращает true, если индекс не выходит за границы массива
    private boolean indexOK (int index){
        if (index >=0 & index < length) {
            return true;
        }
        return false;
    }


    //метод возвр-т значение эл-та массива с заданным индексом

    public int get (int index){
        if (indexOK(index)) {
            return a[index];
        }
        return errval; //либо вернуть элемент массива с заданным индексом, либо вернуть сообщение об ошибке
    }


    //метод. который устанавливает значение эл-та с задан индексом

    public boolean put (int index, int val){
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

}


class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1); //size = 5 и errv = -1 определены в конструкторе
        int x;

        System.out.println("Oбpaбoткa ошибок без вывода отчета.");

        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");


        // Обработать ошибки
        System.out.println("\nOбpaбoткa ошибок с выводом отчета.");

        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10)) System.out.println("Индeкc" + i + "вне допустимого диапазона");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) System.out.print(x + " ");
            else System.out.println("Индeкc" + i + "вне допустимого диапазона");

        }
    }
}