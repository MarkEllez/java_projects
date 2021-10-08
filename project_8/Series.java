package project_8;

public interface Series {
    int getNext(); //возвращает след по порядку число

    //возвращает массив, который возвращает n элементов, располаг-ся в ряду вслед за текущим элементом
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset(); //сброс
    void setStart(int x); // установка начального значения
}

