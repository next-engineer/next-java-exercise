package org.example.basic.kimaram.unitfive;

public class Book {
    private final String title;
    private final String author;
    private final int price;

    // 기본 생성자
    public Book() {
        this.title = "제목 없음";
        this.author = "저자 미상";
        this.price = 0;
    }

    // 매개변수 2개 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // 매개변수 3개 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 출력용 메서드
    public void printInfo() {
        System.out.printf("제목: %s / 저자: %s / 가격: %d%n", this.title, this.author, this.price);
    }
}
