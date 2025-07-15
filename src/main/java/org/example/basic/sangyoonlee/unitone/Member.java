package org.example.basic.sangyoonlee.unitone;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrow(Book book) {
        if (book != null && !book.isBorrowed()) {
            book.borrowBook(); // Book 객체의 대여 상태 변경
            borrowedBooks.add(book);
            System.out.println(name + "님이 '" + book.getTitle() + "' (을)를 대여했습니다.");
        } else if (book != null && book.isBorrowed()) {
            System.out.println("'" + book.getTitle() + "' (은)는 이미 대여 중입니다. " + name + "님은 대여할 수 없습니다.");
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }

    public void returnBook(Book book) {
        if (book != null && borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + "님이 '" + book.getTitle() + "' (을)를 반납했습니다.");
        } else if (book != null && !borrowedBooks.contains(book)) {
            System.out.println(name + "님은 '" + book.getTitle() + "' (을)를 대여하지 않았습니다.");
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }

}
