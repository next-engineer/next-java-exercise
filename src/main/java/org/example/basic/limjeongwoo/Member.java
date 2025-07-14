package org.example.basic.limjeongwoo;

import java.util.ArrayList;

public class Member {

    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // 생성자
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // 책 대여
    public void borrow(Book book){
        book.borrowBook();
        borrowedBooks.add(book);
    }

    // 책 반납
    public void returnBook(Book book) {
        book.returnBook();
        borrowedBooks.remove(book);
    }

    // 대여 중인 책 목록 출력
    public void listBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
