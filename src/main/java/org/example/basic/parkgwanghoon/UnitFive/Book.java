package org.example.basic.parkgwanghoon.UnitFive;

public class Book {

    String title;
    String author;
    int price;

    // 생성자
    public Book() {
        this.title = "제목 없음";
        this.author = "저자 미상";
        this.price = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 정보 출력 메서드
    public void printInfo() {
        System.out.println("제목: " + title + " / 저자: " + author + " / 가격: " + price + "원");
    }
}
