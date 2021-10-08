package project_8;

public interface ICharQ {
    void put (char ch); // поместить символ в очередь

    char get(); // извлечь символ из очереди

    void reset(); // обнулить очередь

    static void copyQueue (ICharQ m, ICharQ n) {
        char ch;
        for (int i = 0; i < 10; i++){
            ch = m.get();
            System.out.println(ch);
            n.put(ch);
        }
    }
}
