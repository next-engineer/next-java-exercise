package org.example.basic.kimaram.unitone;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // 생성자
    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // 책 추가
    public void addBook(Book book){
        books.add(book);
    }

    // 멤버 추가
    public void addMember(Member member){
        members.add(member);
    }

    // 책 이름으로 책 찾기
    public Book findBookByTitle(String title){
        Book result = null;

        for(Book item: books){
            if(item.getTitle().equals(title)){
                result = item;
                break;
            }
        }
        return result;
    }

    // 모든 책 리스트 출력
    public void listAllBooks(){
        for(Book item : books){
            System.out.println(item);
        }
    }

    // 대여 가능한 책 리스트만 출력
    public void listAvailableBooks(){
        for(Book item : books){
            if(!item.isBorrowed()){
                System.out.println(item);
            }
        }
    }
}
