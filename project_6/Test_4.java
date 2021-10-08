package project_6;

public class Test_4 {
    int a;

    Test_4 (int i) {
        a = i;
    }

    //КАК ВЫГЛЯДИТ ОБМЕН СОДЕРЖИМЫМ МЕЖДУ ДВУМЯ ОБЪЕКТАМИ
    void swap (Test_4 ob1, Test_4 ob2) {
        int t;
        t = ob1.a;
        ob1.a = ob2.a;
        ob2.a = t;

    }
}
