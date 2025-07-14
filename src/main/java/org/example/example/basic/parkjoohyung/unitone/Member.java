package org.example.basic.parkjoohyung.unitone;

import java.util.ArrayList;

public class Member {

    String name;
    String memberId;
    ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    //대여한 책 목록
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    //대여한 책 목록에서 지우기
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void listBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

}
