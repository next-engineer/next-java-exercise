package org.example.basic.leehyemin.UnitOne;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    public String memberId;
    public ArrayList<Book> borrowedBooks;

    //기본생성자
    public Member(){

    }
    //매개변수가 있는 생성자
    public Member(String name, String memberId,  ArrayList<Book> borrowedBooks){
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=borrowedBooks;
    }
    //getter 메소드
    public String getName() {
        return this.name;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    //메소드
    public void borrow(Book book) {

    }

    public void returnBook(Book book) {

    }

    public List<Book> listBorrowedBooks() {

        return borrowedBooks;
    }
}
