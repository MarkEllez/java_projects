package project_5;


class ShowBits {
    int numbits;

    ShowBits (int n){ //конструктор создает объекты, которые отображают заланное число битов
        numbits = n;
    }


    void show (int val){   //метод принимает значение val
        long mask = 1;

        mask <<= numbits -1;

        int spacer = 0; //объявляется переменная, которая нужна для отображения пробела в двоичном отобр-нии числа
        for (; mask !=0; mask >>>=1){
            if((val&mask) !=0) System.out.print("1");
            else System.out.print("0");

            spacer++;

            if ((spacer&8) ==0) { // 8 в двоичн системе = 1000
                System.out.print(" ");
                spacer = 8;
            }
        }
    }
}

public class ShowBitsDemo {
    public static void main (String args[]){
        ShowBits b = new ShowBits(8); // 8 - кол-во битов - отображение младших битов
        ShowBits i = new ShowBits(32); // 32 - кол-во битов
        ShowBits li = new ShowBits(64); // 64 - кол-во битов

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представленииэ: ");
        li.show(237658768);
    }
}

