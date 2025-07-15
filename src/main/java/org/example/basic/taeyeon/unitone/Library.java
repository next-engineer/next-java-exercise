package org.example.basic.taeyeon.unitone;

import org.example.basic.mindongil.unitone.Book;
import org.example.basic.mindongil.unitone.Member;

import java.util.ArrayList;
import java.util.Objects;

public class Library {  ArrayList<org.example.basic.mindongil.unitone.Book> books = new ArrayList<org.example.basic.mindongil.unitone.Book>();
    ArrayList<org.example.basic.mindongil.unitone.Member> members = new ArrayList<org.example.basic.mindongil.unitone.Member>();

    //책 추가
    public void addBook(org.example.basic.mindongil.unitone.Book book) {
        books.add(book);
    }

    //멤버 추가
    public void addMember(Member member) {
        members.add(member);
    }

    //책 찾기
    public String findBookByTitle(String title) {
        String name = "";
        for (org.example.basic.mindongil.unitone.Book book : books) {
            if(Objects.equals(book.getTitle(), title)){
                name = book.getTitle();
            }
        }
        return name;
    }

    //모든 책 목록
    public void listAllBooks() {
        for (org.example.basic.mindongil.unitone.Book book : books) {
            System.out.println(book);
        }
    }

    //대여가능한 목록 책 찾기
    public void listAvailableBooks() {
        for (Book book : books) {
            if(book.isBorrowed){
                System.out.println(book);
            }
        }
    }

}
