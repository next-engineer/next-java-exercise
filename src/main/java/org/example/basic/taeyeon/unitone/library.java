package org.example.basic.taeyeon.unitone;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Objects;

public class library {
        private ArrayList<Book> books = new ArrayList<>();
        private ArrayList<Member> members = new ArrayList<>();

        // 책 추가
        public void addBook(Book book) {
            books.add(book);
        }

        // 멤버 추가
        public void addMember(Member member) {
            members.add(member);
        }

        // 책 찾기
        public Object findBookByTitle(String title) {
            for (Book book : books) {
                if (Objects.equals(book.getClass(), title)) {
                    return book.getClass();
                }
            }
            return "";
        }

        // 모든 책 목록
        public void listAllBooks() {
            for (Book book : books) System.out.println(book);
        }
}