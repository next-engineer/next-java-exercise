package org.example.basic.kimyoungji.unitone;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrow(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("대여 실패: 이미 대여 중입니다.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("반납 실패: 이 책은 현재 회원이 대여한 책이 아닙니다.");
        }
    }

    public void listBorrowedBooks() {
        System.out.println("[" + name + "]의 대여 목록:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("  대여 중인 책이 없습니다.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("  - " + book.toString());
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }
}
