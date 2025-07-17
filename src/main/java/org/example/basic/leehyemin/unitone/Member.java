package org.example.basic.leehyemin.unitone;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    //기본생성자
    public Member(){

    }
    //매개변수가 있는 생성자
    public Member(String name, String memberId){
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=new ArrayList<>();
    }
    //getter 메소드
    public String getName() {
        return this.name;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    //메소드
    public void borrow(Book book) {
        borrowedBooks.add(book);
        System.out.println("대출에 성공하셨습니다.");
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println("반납되셨습니다.");
    }

    public void listBorrowedBooks() {
        System.out.println(name+"님의 대출 목록 : ");
        if(borrowedBooks.isEmpty()) {
            System.out.println("대출 중인 도서가 없습니다.");
        } else {
            for(Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성", "123");
        Book book2 = new Book("토비의 스프링", "이일민", "456");
        Book book3 = new Book("클린 코드", "로버트 마틴", "789");

        Member member=new Member("이혜민", "leehyemin");

        member.borrow(book1);
        member.borrow(book2);
        member.borrow(book3);
        member.listBorrowedBooks();
    }
}
