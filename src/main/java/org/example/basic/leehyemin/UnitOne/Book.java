package org.example.basic.leehyemin.UnitOne;

import java.util.ArrayList;

public class Book {
    //필드
    public String title;
    public String author;
    public String isbn;
    //true 대출 불가, false 대출 가능
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
        this.isBorrowed=false;
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

    public ArrayList<Book> allBookInfo(String title) {

        return null;
    }
}
