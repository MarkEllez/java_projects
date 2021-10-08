package project_14;

public class LambdaExceptionDemo {
    public static void main (String args[]){
        MyIOAction ma = (rdr) -> {
            int result = rdr.read();    //может генерировать IOException
            //...
            return true;
        };
    }
}
