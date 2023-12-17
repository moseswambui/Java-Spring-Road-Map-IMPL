package OOP.BookOOPExample;

import java.util.Date;

public class Book {

    private String name;
    private String publishDate;
    private String author;

    // Constructor
    public Book(String name, String publishDate, String author) {
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
    }



    public void displayBookInfo(){
        System.out.println("Book: " + name);
        System.out.println("Author: " + author);
        System.out.println("Publish Date: " + publishDate);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
