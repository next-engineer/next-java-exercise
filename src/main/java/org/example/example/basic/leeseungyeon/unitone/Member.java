package org.example.basic.leeseungyeon.unitone;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    // 생성자
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // 책 대여
    public void borrow(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println(book.getTitle() + " 은(는) 이미 대여 중입니다.");
        }
    }

    // 책 반납
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println(book.getTitle() + " 은(는) 이 회원이 빌린 책이 아닙니다.");
        }
    }

    // 대여 중인 책 목록 출력
    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " 님은 현재 대여 중인 책이 없습니다.");
        } else {
            System.out.println(name + " 님의 대여 목록:");
            for (Book book : borrowedBooks) {
                System.out.println("  - " + book);
            }
        }
    }

    public String getName() {
        return name;
    }
}