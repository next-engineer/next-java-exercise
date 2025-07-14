package org.example.basic.leehyemin.UnitOne;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;
    public ArrayList<Member> members;

    public void addBook(Book book){

    }

    public void addMember(Member member){

    }

    public String findBookByTitle(String title){
        return title;
    }

    public ArrayList<Book> listAllBooks(){
        return books;
    }

    public ArrayList<Book> listAvailableBooks(){
        return books;
    }

    public static void main(String[] args) {
        Book book = new Book("자바의 정석", "남궁성", "1234567890");
        book.getTitle();
    }
}
