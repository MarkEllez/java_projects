package project_5;

public class StringDemo {
    public static void main(String args[]){
        String str = new String("Java 1");
        String str1 = "Java 2";
        String str2 = new String (str);

        System.out.println( str + '\n' + str1 + '\n' + str2);



        //посимвольно отобразить строку

        for (int i=0; i < str.length(); i++){ //возвращение длины строки
            str.charAt(i);
            System.out.print(str.charAt(i));
            System.out.println();
        }
    }
}
