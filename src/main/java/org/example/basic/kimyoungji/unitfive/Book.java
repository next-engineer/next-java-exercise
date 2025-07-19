package org.example.basic.kimyoungji.unitfive;

public class Book {
    private String title;
    private String author;
    private int price;

    // 1. 기본 생성자
    public Book() {
        this.title = "제목 없음";
        this.author = "저자 미상";
        this.price = 0;
    }

    // 2. 매개변수 2개 생성자 (title, author), price는 0으로 초기화
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // 3. 매개변수 3개 생성자 (title, author, price)
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 출력용 메서드
    public void printInfo() {
        System.out.println("제목: " + title + " / 저자: " + author + " / 가격: " + price + "원");
    }
}
