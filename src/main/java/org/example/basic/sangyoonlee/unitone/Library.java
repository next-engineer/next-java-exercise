package org.example.basic.sangyoonlee.unitone;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서관에 '" + book.getTitle() + "' (이)가 추가되었습니다.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("도서관에 회원 '" + member.getName() + "' (이)가 등록되었습니다.");
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("도서관에 등록된 책이 없습니다.");
        } else {
            System.out.println("\n--- 도서관 전체 책 목록 ---");
            for (Book book : books) {
                System.out.println(book.toString());
            }
            System.out.println("-------------------------\n");
        }
    }

    public void listAvailableBooks() {
        System.out.println("\n--- 대여 가능한 책 목록 ---");
        boolean foundAvailable = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.toString());
                foundAvailable = true;
            }
        }
        if (!foundAvailable) {
            System.out.println("현재 대여 가능한 책이 없습니다.");
        }
        System.out.println("-------------------------\n");
    }

}
