package org.example.basic.sangyoonlee.unitone;

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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            System.out.println("'" + title + "' (이)가 대여되었습니다.");
        } else {
            System.out.println("'" + title + "' (은)는 이미 대여 중입니다.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("'" + title + "' (이)가 반납되었습니다.");
        } else {
            System.out.println("'" + title + "' (은)는 대여 중인 책이 아닙니다.");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
