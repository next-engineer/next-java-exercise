package org.example.basic.mindongil.unitfive;

public class Book {

    private String title;
    private String author;
    private int price;

    Book() {
        this.title = "제목 없음";
        this.author = "저자 미상";
        this.price = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.printf("제목: %s / 저자: %s / 가격: %d원\n" , this.title, this.author, this.price);
    }

}
