package org.example.basic.leehyemin.unitfive;

public class Book {
    private String title;
    private String author;
    private int price;

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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("제목 : "+this.title+" / 저자 : "+this.author+" / 가격 : "+this.price);
    }
}
