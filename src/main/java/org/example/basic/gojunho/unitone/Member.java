package org.example.basic.gojunho.unitone;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId){
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=new ArrayList<>();
    }
    public void borrow(Book book){
        if(!book.isBorrowed()){
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name+"님이"+book.getTitle()+"책을 대여했습니다.");
        }
        else{
            System.out.println("이미 대여된 책입니다");
        }
    }
    public void returnBook(){
        if(borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name+"님이"+book.getTitle()+"책을 반납했습니다");
        }
        else{
            System.out.println("대여한 책이 아닙니다.");
        }
    }
    public void listBorrowebBooks(){
        System.out.println("["+name+"님의 대여목록]");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
