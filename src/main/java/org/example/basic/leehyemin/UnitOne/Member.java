package org.example.basic.leehyemin.UnitOne;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    public String memberId;
    public ArrayList<Book> borrowedBooks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
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
