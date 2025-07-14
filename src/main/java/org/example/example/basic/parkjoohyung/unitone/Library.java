package org.example.basic.parkjoohyung.unitone;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Member> members = new ArrayList<Member>();

    //책 추가
    public void addBook(Book book) {
        books.add(book);
    }

    //멤버 추가
    public void addMember(Member member) {
        members.add(member);
    }

    //책 찾기
    public String findBookByTitle(String title) {
        String name = "";
        for (Book book : books) {
            if(Objects.equals(book.title, title)){
                name = book.title;
            }
        }
        return name;
    }

    //모든 책 목록
    public void listAllBooks() {
        for (Book book : books) {
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
