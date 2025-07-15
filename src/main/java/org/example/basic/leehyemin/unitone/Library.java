package org.example.basic.leehyemin.unitone;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public ArrayList<Book> books;
    public ArrayList<Member> members;

    public Library() {
        this.books=new ArrayList<>();
        this.members=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("'"+book.getTitle()+"' 이(가) 등록되었습니다.");
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println(member.getName()+"님 회원가입을 축하드립니다.");
    }

    public void findBookByTitle(String title){
        for(Book book:books){
            if(book.getTitle().equals(title)){
                System.out.println(book.getTitle()+"이(가) 있습니다.");
            }
        }

    }

    public void listAllBooks(){
        for(Book book:books){
            System.out.println(book.getTitle());
        }
    }

    public void listAvailableBooks(){
        for(Book book:books){
            if(!book.isBorrowed){
                System.out.println(book.getTitle()+" : 대출 가능");
            } else {
                System.out.println(book.getTitle()+" : 대출 불가능");
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성", "123");
        Book book2 = new Book("토비의 스프링", "이일민", "456");
        Book book3 = new Book("클린 코드", "로버트 마틴", "789");

        Member member1=new Member("이혜민", "1234");
        Member member2=new Member("이종석", "5678");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        library.findBookByTitle("자바의 정석");
        library.listAllBooks();

        library.listAvailableBooks();
    }
}
