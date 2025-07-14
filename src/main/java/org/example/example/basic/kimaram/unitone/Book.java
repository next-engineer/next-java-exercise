package org.example.basic.kimaram.unitone;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // 기본 생성자
    public Book(){}

    // 매개변수 가진 생성자
    public Book(String title, String author, String isbn, boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    // 대여 처리
    public void borrow(){
        this.isBorrowed = true;
    }

    // 반납 처리
    public void returnBook(){
        this.isBorrowed = false;
    }

    // 책 정보 문자열 반환
    @Override
    public String toString(){
        return "title: " + this.title + ", author: " + this.author + ", isbn: "+ this.isbn + ", isBorrowed: "+ this.isBorrowed;
    }

    // getter
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

}
