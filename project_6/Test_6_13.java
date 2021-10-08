package project_6;

public class Test_6_13 {

    int con (int...v) {
        int result = 0;

        for (int i = 0; i < v.length; i++){
            result += v[i];

        }

        System.out.println(result);

        return result;
    }
}

class res {
    public static void main (String args[]){
        Test_6_13 ob = new Test_6_13();

        ob.con(1, 2, 3);
    }
}
