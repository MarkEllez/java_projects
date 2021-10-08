package project_7;


class ErrorMsg {
    final int outerr = 0;
    final int inerr = 1;
    final int diskerr = 2;
    final int indexerr = 3;

    String msg[] = {
        "Ошибка ввода",
        "Ошибка вывода",
        "Отсутсвует место на диске",
        "Выход индекса за границы диапазона"
    };

    String getErrorMsg (int i) {

        if (i>=0 & i < msg.length){
            return msg[i];
        }
        else
            return "Несуществующий код ошибки";
    }
}


public class FinalD {
    public static void main (String args[]){
        ErrorMsg ob = new ErrorMsg();

        System.out.println(ob.getErrorMsg(ob.outerr));
    }
}
