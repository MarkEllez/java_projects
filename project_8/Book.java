package project_8;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book (String t, String a, int p) {
        title = t;
        author = a;
        pubDate = p;
    }

    public void show () {
        System.out.print(title + " ");
        System.out.print(author + " ");
        System.out.print(pubDate);
        System.out.println();
    }
}

