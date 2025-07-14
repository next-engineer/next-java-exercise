package org.example.basic.kimaram.unitone;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    // 기본 생성자
    public Member() {}

    // 매개변수를 가진 생성자
    public Member(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
    }

    // 책 대여
    public void borrow(Book book){
        book.borrow();
        borrowedBooks.add(book);
    }

    // 책 반납
    public void returnBook(Book book){
        book.returnBook();
        borrowedBooks.remove(book);
    }

    // 대여 중인 책 목록 출력
    public void listBorrowedBooks(){
        for(Book item: borrowedBooks){
            System.out.println(item);
        }
    }

}
