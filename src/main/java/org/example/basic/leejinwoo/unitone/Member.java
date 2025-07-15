package org.example.basic.leejinwoo.unitone;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public void setName(String name){
        this.name = name;
    }
    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public static Book borrow(Book book){   //책 대여
        book.setBorrowed(true);
        return book;
    }

    public static Book returnBook(Book book){ //책 반납
        book.setBorrowed(false);
        return book;
    }

    public static void listBorrowedBooks(ArrayList<Book> list){ //대여 목록 출력

        for(Book book : list){
            System.out.println("대여 목록 : " + book.getTitle());
        }
    }

    public static void main(String[] args){
        Member member = new Member();
        member.setMemberId("Rr");
        member.setName("이진우");
        member.setBorrowedBooks(new ArrayList<>());

        Book book = new Book();
        book.setTitle("ABCD");
        book.setAuthor("A");
        book.setIsbn("O");
        book.setBorrowed(false);

        member.borrowedBooks.add(borrow(book)); //대여

        listBorrowedBooks(member.borrowedBooks);
    }
}
