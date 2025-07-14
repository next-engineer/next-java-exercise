package org.example.basic.leehyemin.UnitOne;

import java.util.ArrayList;

public class Book {
    //필드
    private String title;
    public String author;
    public String isbn;
    //true 대출 불가, false 대출 가능
    public boolean isBorrowed;

    //기본 생성자 : 기본적으로 생성됨
    public Book(){

    }
    //매개변수가 있는 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }
    //getter 메소드
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }

    //메서드
    public void borrowBook() {
        if(!isBorrowed){
            isBorrowed=true;
            System.out.println("책이 되출되었습니다.");
        } else {
            System.out.println("이미 대출 중인 책입니다.");
        }
    }

    public void returnBook() {
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("반납처리되었습니다.");
        }
    }

    public String toString() {
        return "책제목 : "+this.title+", 작가 : "+this.author+", 일련번호 : "+this.isbn;
    }

}
