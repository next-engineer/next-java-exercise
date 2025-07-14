package org.example.basic.gojunho.unitone;

public class Book {
    public String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public void borrowBook(){
        isBorrowed = true;
    }

    void returnBook(){
        isBorrowed = false;
    }
    public String toString(){
        return "제목: " + title + ", 저자: " + author + ", ISBN: " + isbn +
                ", 대여중: " + (isBorrowed ? "예" : "아니오") + "]";
    }
    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
