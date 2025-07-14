package org.example.basic.leehyemin.UnitOne;

import java.util.ArrayList;

public class Book {
    //필드
    public String title;
    public String author;
    public String isbn;
    //true 대여 가능, false 대출 불가
    public boolean isBorrowed;

    //생성자
    public void setTitle(){
        this.title=title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(){
        this.author=author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setIsbn(){
        this.isbn=isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setIsBorrowed(){
        this.isBorrowed=true;
    }

    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }

    //메서드
    public void borrowBook() {

    }

    public void returnBook() {

    }

    public ArrayList<Book> bookinfo() {

        return null;
    }
}
