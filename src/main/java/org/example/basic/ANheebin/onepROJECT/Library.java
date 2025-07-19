package org.example.basic.ANheebin.onepROJECT;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
        System.out.println("책 '" + bookTitle + "'이(가) 도서관에 추가되었습니다.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("회원 '" + member.getName() + "'이(가) 등록되었습니다.");
    }

    public String findBookByTitle(String title) {
        for (String book : books) {
            if (book.equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("도서관에 등록된 책이 없습니다.");
        } else {
            System.out.println("=== 전체 도서 목록 ===");
            int count = 1;
            for (String book : books) {
                System.out.println(count + ". " + book);
                count++;
            }
        }
    }

    public void listAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("대여 가능한 책이 없습니다.");
        } else {
            System.out.println("=== 대여 가능한 도서 목록 ===");
            int count = 1;
            for (String book : books) {
                System.out.println(count + ". " + book + " (대여 가능)");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        
        // 책 추가
        library.addBook("오리엔트 특급 살인사건");
        library.addBook("피터팬");
        library.addBook("그리고 아무도 없었다");
        
        // 회원 추가
        Member member1 = new Member("안희빈", "M001");
        library.addMember(member1);
        
        // 도서 목록 출력
        library.listAllBooks();
        library.listAvailableBooks();
        
        // 책 검색
        String foundBook = library.findBookByTitle("피터팬");
        if (foundBook != null) {
            System.out.println("찾은 책: " + foundBook);
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }
}
