package org.example.basic.taebinlee.unitone;

public class Book {
    // 필드
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // 생성자(가장 먼저 실행)
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // 대여 처리
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " 이(가) 대여되었습니다.");
        } else {
            System.out.println(title + " 은(는) 이미 대여 중입니다.");
        }
    }

    // 반납 처리
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " 이(가) 반납되었습니다.");
        } else {
            System.out.println(title + " 은(는) 대여 중이 아닙니다.");
        }
    }

    // 책 정보 반환
    public String toString() {
        return "[" + title + " | " + author + " | ISBN: " + isbn + " | " + (isBorrowed ? "대여 중" : "대여 가능") + "]";
    }

    // getter
    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
