package org.example.basic.limjeongwoo.unitone;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;


    // 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // 대여 처리
    public void borrowBook(){
        isBorrowed = true;
    }

    // 반납 처리
    public void returnBook(){
        isBorrowed = false;
    }

    // 책 정보 문자열 반환
    public String toString(){
        return String.format("도서명: %s, 저자: %s, 대여여부: %s",title, author, isBorrowed ? "대여중" : "대여가능");
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getTitle() {
        return title;
    }

}
