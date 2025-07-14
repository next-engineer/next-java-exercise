package org.example.basic.parkjoohyung.unitone;

public class Book {

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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
