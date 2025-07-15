package org.example.basic.taeyeon.unitone;

import org.example.Book;
import org.example.Member;

import java.util.ArrayList;

public class Library { private ArrayList<org.example.Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(org.example.Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public org.example.Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
}
