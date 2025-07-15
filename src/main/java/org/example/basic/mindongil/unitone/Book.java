package org.example.basic.mindongil.unitone;

public class Book {

    private String title;
    private String author;
    private String isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    //책 대여
    public void borrowBook() {
        isBorrowed = true;
    }

    //책 반납
    public void returnBook() {
        isBorrowed = false;
    }

    public String toString() {
        return title + " " + author + " " + isbn;
    }

}
