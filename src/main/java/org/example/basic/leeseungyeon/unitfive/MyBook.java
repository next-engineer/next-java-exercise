package org.example.basic.leeseungyeon.unitfive;

public class MyBook {
    public static void main(String[] args) {
        Book book1 = new Book();  // 기본 생성자만 사용

        book1.printInfo();

        // MyBook인 이유는 인텔리제이에서 오류 때문에.. 저렇게 만듦
    }
}

// 도메인 클래스: Book
class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
        this.title = "제목없음";
        this.author = "저자미상";
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

    public void printInfo() {
        System.out.println("제목: " + title + " / 저자: " + author + " / 가격: " + price + "원");
    }
}