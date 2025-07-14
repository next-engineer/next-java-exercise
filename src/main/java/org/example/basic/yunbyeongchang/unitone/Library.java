package org.example.basic.yunbyeongchang.unitone;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    //var
    public ArrayList<Book> books;                      // 책 리스트
    public ArrayList<Member> members;                  // 멤버 리스트

    //method
    public Library()
    {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book)               // 책 추가
    {
        this.books.add(book);
        System.out.println(book.title + "이(가) 도서관에 추가되었습니다.");
    }

    public void addMember(Member member)         // 멤버 추가
    {
        this.members.add(member);
        System.out.println(member.name + "님이 가입하셨습니다.");
    }

    public void findBookByTitle(String title)    // 제목으로 책 찾기
    {
        for (Book book : this.books) {
            if (Objects.equals(book.title, title)) {
                System.out.println(book.toString());
                break;
            }
        }
    }

    public void listAllBooks()                   // 모든 책 리스트 출력
    {
        System.out.print("도서관 내 모든 책 : ");
        for (Book book : this.books)
            System.out.print(book.title + " ");

        System.out.println();
    }

    public void listAvailableBooks()             // 이용 가능 책 출력
    {
        System.out.print("도서관 내 모든 이용 가능 책 : ");
        for (Book book : this.books)
            if(!book.isBorrowed) System.out.print(book.title + " ");

        System.out.println();
    }

}
