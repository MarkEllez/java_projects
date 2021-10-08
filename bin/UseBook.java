package bin;

import project_8.Book;

public class UseBook {
    public static void main (String args[]){
        Book books[] = new Book [3];

        books[0] = new project_8.Book("Harry", "Rowling", 2000);
        books[1] = new project_8.Book("Nub", "qwer", 2001);
        books[2] = new project_8.Book("plpko", "qwerrt", 2002);
       // books[3] = new project_8.Book("wewer", "qwre23r", 2003);

        for (int i = 0; i < books.length; i++)
            books[i].show();

    }
}
