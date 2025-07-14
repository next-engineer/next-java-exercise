package org.example.basic.gojunho.unitone;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library(){
        books= new ArrayList<>();
        members=new ArrayList<>();
    }
    public void addbook(Book book){
        books.add(book);
    }
    public void addMember(Member member){
        member.add(member);
    }
    public Book findBookByTitle(String title){
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("책을 찾을 수 없습니다: " + title);
        return null;
    }
    public void listAllBooks(){
        System.out.println("=== 전체 책 목록 ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public void listAvailableBooks(){
        System.out.println("=== 대여 가능 책 목록 ===");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
    }
}
