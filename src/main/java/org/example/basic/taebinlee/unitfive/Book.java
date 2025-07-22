package org.example.basic.taebinlee.unitfive;

public class Book {
    private String title;
    private String author;
    private int price;


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

    // 출력 메서드
    public void printInfo(){
        System.out.println("제목: " + title + "\n 저자: " + author +
                "\n 가격: "+ price);
        System.out.println("---------------");
        System.out.println();
    }
}

