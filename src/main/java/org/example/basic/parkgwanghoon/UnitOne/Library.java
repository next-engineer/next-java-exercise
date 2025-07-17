package org.example.basic.parkgwanghoon.UnitOne;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(Member member) {
        members.add(member);
    }
    public void printAllBooks() {
        System.out.println("책 목록:");
        for (Book book : books) {
            book.printInfo();
        }
    }
    public void printAllMembers() {
        System.out.println("회원 목록:");
        for (Member member : members) {
            member.printInfo();
        }
    }
}