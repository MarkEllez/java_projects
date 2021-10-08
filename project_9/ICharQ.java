package project_9;

public interface ICharQ {
    void put (char ch) throws QueueFullException; // поместить символ в очередь

    char get() throws QueueEmptyException; // извлечь символ из очереди

    void reset(); // обнулить очередь

   /* static void copyQueue (ICharQ m, ICharQ n) {
        char ch;
        for (int i = 0; i < 10; i++){
            ch = m.get();
            System.out.println(ch);
            n.put(ch);
        }
    }
    */
}
