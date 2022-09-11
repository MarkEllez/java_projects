package project_5;

public class QDemo {
    public static void main (String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;


        //Положить символы в bigQ:

        System.out.println("Сохранение бол очереди для исп-ния алфавита: ");
        for (i = 0; i < 26; i++) {
            bigQ.put((char)('A' + i));
        }

        //Извлечь символы из bigQ

        System.out.println("Извлечь содержимое bigQ: ");
        for (i=0; i<26; i++) {
            ch = bigQ.get();
            if (ch  != (char) 0)
            System.out.print(ch);
        }


        //Положить символы в smallQ:

        System.out.println('\n' + "Сохранение маленькой очереди: ");

        for(i=0; i<5; i++){
            smallQ.put((char)('Z' - i));
            System.out.print("Попытка сохранения " + (char)('Z' - i));
            System.out.println();
        }

        //Извлечь символы из smallQ
        System.out.println("Извлечь содержимое smallQ: ");
        for(i=0; i<5; i++){
            ch = smallQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
        System.out.println();
    }


}

class Queue {
    char q[]; //массив для хранения данных
    int putloc, getloc; // индексы для вставки и извлечения данных соотв-но


    Queue (int size){
       char q[] = new char[size+1]; // создаем массив как объект и выдялем память для очереди
        //размер массива на 1 больше, чем размер очереди, т.к. один элемент массива остается неиспользованным
        putloc = getloc = 0;
    }

    //метод для помещения значения в очередь
    void put(char ch){
        if(putloc==q.length-1){
            System.out.println("Очередь полна");
        return;
        }

        putloc++;
        q[putloc] = ch; // переменная putloc инкрекментируется и новый элемент располагается в указанном месте массива
    }

    char get(){
        if (getloc==putloc){
            System.out.println("Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc]; //переменная getloc инкр-ся и из очереди извлекается очередной элемент,
        //то есть переменная getloc сод-т индекс последнего извлеченного эл-та
    }

}
