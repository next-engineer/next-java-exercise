package org.example.basic.kimyoungji.unitone;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서 추가: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("회원 등록: " + member.getName());
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("책 [" + title + "]을(를) 찾을 수 없습니다.");
        return null;
    }

    public void listAllBooks() {
        System.out.println("전체 도서 목록:");
        for (Book book : books) {
            System.out.println("  - " + book.toString());
        }
    }

    public void listAvailableBooks() {
        System.out.println("대여 가능한 도서 목록:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("  - " + book.toString());
            }
        }
    }
}
