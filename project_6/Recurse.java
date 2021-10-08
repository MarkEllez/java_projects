package project_6;

public class Recurse {
    String i;

    Recurse (String ob) {
        i = ob;
    }

    void chan (int idx) {

        if (idx != i.length()-1)  //если входящий параметр для метода не равен длине строки - 1, то вызываем этот же метод, в котором к
            chan(idx+1);   // входящему параметру прибавляем 1
        System.out.print(i.charAt(idx) + " " + idx); //отображаем символ строки i по его номеру нахождения в строке. Если idx = 0, то возвращаем первый символ строки i
    }
}

class Pos {
    public static void main(String args[]) {
        Recurse ob = new Recurse("qwerty");

        ob.chan(0);
    }
}

//получается, что метод chan() исполняется с того символа строки, который указываем в ob.chan();