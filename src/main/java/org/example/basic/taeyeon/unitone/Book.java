package org.example.basic.taeyeon.unitone;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isBorrowed() {
        return this.isBorrowed;
    }

    public static boolean borrowBook(){ //대여처리
        return true;
    }

    public static boolean returnBook(){ //반납처리
        return false;
    }
}
