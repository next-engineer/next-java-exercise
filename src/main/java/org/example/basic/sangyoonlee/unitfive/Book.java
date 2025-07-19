package org.example.basic.sangyoonlee.unitfive;

import java.text.DecimalFormat;

public class Book {
    private final String title;
    private final String author;
    private final int price;

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
        System.out.println("제목: " + title + "/ 저자: " + author + "/ 가격: " + formatPrice(price));
        System.out.println();
    }
    
    private String formatPrice(int price) {
        DecimalFormat df = new DecimalFormat("###,###");
        return (df.format(price) + "원");
    }
}
