package org.example.basic.gojunho.unitfive;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public Book(String title,String author){
        this.title=title;
        this.author=author;
        price=0;
    }

    public Book(){
        title="제목 없음";
        author="저자 미상";
        price=0;
    }

    public void printInfo(){
        System.out.println("제목: "+title+"/ 저자: "+author+"/ 가격: "+price+"원");
    }
}
