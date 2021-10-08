package project_14;

class MyClass2 {
    private int t;

    MyClass2 (int s) {
        t = s;
    }


    int getInt () {
        return t;
    }
}


public class ClassMyArrayCreator {
    public static void main (String args[]){
        MyClass2 result;

        MyArrayCreator mm = MyClass2[]::new;    //создается ссылка на конструктор массива

        MyClass2[] myClass2 = mm.func(4);       //запускаем метод из функц интерфейса для созданного объекта mm
        //создается массив, состоящий из n кол-ва элементов

        for (int i = 0; i < 4; i++) {
            myClass2[i] = new MyClass2(i);
            result = myClass2[i];
            System.out.println(result.getInt());
        }

    }

}
