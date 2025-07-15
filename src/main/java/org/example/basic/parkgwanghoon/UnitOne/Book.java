package org.example.basic.parkgwanghoon.UnitOne;

public class Book {
    String title;
    String author;
    int year;
    public Book() {
        this("책 제목", "저자", 2024);
    }
    public Book(String title) {
        this(title, author, 2024);
    }
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void printInfo() {
        System.out.println("도서명: " + title + ", 저자: " + author + ", 출판연도: " + year);
    }
}
