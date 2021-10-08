package project_14;

class MyIntNum{
    private int v;

    MyIntNum (int x){
        v = x;
    }

    int getNum (){
        return v;
    }

    boolean isFactor (int n){
        return (v%n) == 0;
    }

}


public class MethodRefDemo2 {
    public static void main (String args[]){
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;      //ссылка на метод isFactor объекта myNum

        result = ip.test(3);        //для объекта myNum не будет работать метод test, так как class не имплементирует интерфейс, в котором объявляется метод test

        if (result)
            System.out.println("3 является делителем" + myNum.getNum());

        ip = myNum2::isFactor;

        result = ip.test(3);

        if (!result) {
            System.out.println("3 не является делителем" + myNum2.getNum());
        }
    }
}
