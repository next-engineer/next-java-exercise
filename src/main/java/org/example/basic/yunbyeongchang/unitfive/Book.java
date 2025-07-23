package org.example.basic.yunbyeongchang.unitfive;

public class Book {
    //var
    private String title;
    private String author;
    private int price;

    private final String titleNull = "제목 없음";
    private final String authorNull = "저자 미상";
    private final int priceNull = 0;
    //method
    public Book()
    {
        this.title = titleNull;
        this.author = authorNull;
        this.price = priceNull;

    }

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.price = priceNull;
    }

    public Book(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo()
    {
        System.out.println("제목: " + this.title + " / 저자: " + this.author + " / 가격: " + this.price + "원");
    }
}
