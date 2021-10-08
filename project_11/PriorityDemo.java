package project_11;

class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    Priority (String name) {                                    //создание нового потока без запуска на выполнение
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {                                         //точка входа в поток
        System.out.println("Запуск" + thrd.getName());

        do {
            count++;                                            //счетчик циклов

            if (currentName.compareTo(thrd.getName()) != 0){    //определение имени текущего потока
                currentName = thrd.getName();
                System.out.println("В" + currentName);
            }
        }
        while (stop == false && count < 10000000);

        stop = true;
        System.out.println("\n" + thrd.getName() + "- завершение");
    }
}




public class PriorityDemo {
    public static void main (String args[]){
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low Priority");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);      //УСТАНОВКА ПРИОРИТЕТОВ
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thrd.start();                                   //ЗАПУСК ПОТОКОВ
        mt2.thrd.start();

        try {                                               //ЗАВЕРШЕНИЕ ПОТОКОВ
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание основного потока");
        }

        System.out.println("\n Счетчик потока High Priority: " + mt1.count);
        System.out.println("\n Счетчик потока Low Priority: " + mt2.count);
    }
}
