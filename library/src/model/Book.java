package model;

/**
 * Created by Piotr on 2019-09-17
 */
public class Book extends Publication{
    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        this(title, author, year, pages, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int year, int pages, String publisher) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
    }

    //gettery i settery

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() + "; " + pages + "; " + getPublisher();
        if (isbn != null) {
            info += "; " + isbn;
        }
        System.out.println(info);
    }

    public void printInfo2() {
    }
}
