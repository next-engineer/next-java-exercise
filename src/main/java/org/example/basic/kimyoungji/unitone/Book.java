package org.example.basic.kimyoungji.unitone;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("[" + title + "] 대여 완료.");
        } else {
            System.out.println("[" + title + "]는 이미 대여 중입니다.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("[" + title + "] 반납 완료.");
        } else {
            System.out.println("[" + title + "]는 대여되지 않았습니다.");
        }
    }

    @Override
    public String toString() {
        return String.format("제목: %s | 저자: %s | ISBN: %s | 대여 여부: %s",
                title, author, isbn, isBorrowed ? "대여 중" : "대여 가능");
    }

    public String getTitle() {
        return title;
    }
}