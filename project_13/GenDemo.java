package project_13;


class Gen<T> {                 //T значает обобщенный тип
    T ob;                      //объявить объект типа T

    Gen(T o) {
        ob = o;
    }

    T getOb(){
        return ob;             //вернуть объект ob из метода
    }


    void showType(){
        System.out.println("Тип T - это " + ob.getClass().getName());       //отобразить тип Т
    }

}


public class GenDemo {
    public static void main (String args[]){
        Gen<Integer> iOb;                           //создание ссылки на объект типа Gen<Integer>

        iOb = new Gen<Integer>(88);             //упаковка значения 88 и создание экземпляра типа Gen<Integer>
        //если напишем  iOb = new Gen<Double>(88); - то компилятор сообщит об ошибке

        iOb.showType();

        int v = iOb.getOb();                       //получение значения из объекта iOb
        System.out.println("значение: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Тестирование обобщений");

        strOb.showType();                           //отобразить тип данных, используемых в объекте strOb

        String str = strOb.getOb();

        System.out.println("значение " + str);

        Gen<String> sOb = new Gen<>("Str");

        sOb = strOb;
        String s = sOb.getOb();
        System.out.println("S = " + s);

    }
}
