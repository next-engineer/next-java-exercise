package org.example.basic.leeseungyeon.unitone;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // 생성자
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // 책 추가
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " 이(가) 도서관에 추가되었습니다.");
    }

    // 회원 추가
    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " 님이 회원으로 등록되었습니다.");
    }

    // 제목으로 책 찾기
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("해당 제목의 책을 찾을 수 없습니다.");
        return null;
    }

    // 전체 책 목록
    public void listAllBooks() {
        System.out.println("📘 전체 도서 목록:");
        for (Book book : books) {
            System.out.println("  - " + book);
        }
    }

    // 대여 가능한 책 목록
    public void listAvailableBooks() {
        System.out.println("📗 대여 가능한 책 목록:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("  - " + book);
            }
        }
    }
}