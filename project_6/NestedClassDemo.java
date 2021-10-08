package project_6;

class Outer {
    int nums[];  //определяем массив nums

    Outer (int n[]){ //КОНСТРУКТОР - ИНИЦИАЛИЗИРУЕТ МАССИВ nums[]
        nums = n;
    }

    void Analyze(){
        Inner ob = new Inner();

        System.out.println(ob.min());
        System.out.println(ob.max());
        System.out.println(ob.avg());

    }


    //СОЗДАЕМ ВНУТРЕНИИЙ КЛАСС

    class Inner {

        //создаем метод, который возвращает минимальное число
        int min (){
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }

            return m;
        }

        int max () {
            int m = nums[0];

            for (int i =1; i < nums.length; i++){
                if (nums[i] > m) m = nums[i];
            }

            return m;
        }

        int avg() {
            int a = 0;

            for (int i = 0; i < nums.length; i++){
                a = a + nums[i];
            }

            return a/nums.length;
        }
    }


}


public class NestedClassDemo {
    public static void main (String args[]){
        int x[] = {3, 5, 7, 6, 8, 2, 1};
        Outer outOb = new Outer(x);

        outOb.Analyze();
    }
}
