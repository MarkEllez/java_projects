package project_14;

public class VarCapture {
    public static void main (String args[]){
        int num = 10;   //инициализированная переменная (выступает как переменная типа final - то есть как константа)

        MyFunc varCap = (n) -> {
            int result;

            result = num + n;

            // num++; - некорректно, так как это изменяет значение захваченной переменной

            return result;
        };

        System.out.println(varCap.func(8));

    }
}
