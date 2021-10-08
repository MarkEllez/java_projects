package project_11;

public class UseMain {
    public static void main (String args[]){
        Thread thrd;

        thrd = Thread.currentThread();  //ПОЛУЧЕНИЕ ССЫЛКИ НА ПОТОК

        System.out.println("Имя основного потока: " + thrd.getName());

        System.out.println("Приоритет: " + thrd.getPriority());

        System.out.println();


        System.out.println("Установка имени и приоритета\n");
        thrd.setName("Thread#1");

        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Новое имя основного потока: " + thrd.getName());
        System.out.println("Новой приоритет основного потока: " + thrd.getPriority());


    }

}
