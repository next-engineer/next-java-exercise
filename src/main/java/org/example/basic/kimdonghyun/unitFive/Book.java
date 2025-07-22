package org.example.basic.kimdonghyun.unitFive;

public class Book {
    //필드
   private String title;
   private String author;
   private int price;

   // 기본생성자
    public Book(){
        this.title = "제목없음";
        this.author = "저자미상";
        this.price = 0;
    }
    //매개변수 2개 생성자

    public Book(String title, String author){
        this.title = "제목없음";
        this.author = "저자미상";
    }

    // 매개변수 3개 생성자
   public void Book(String title, String author, int price){
       this.title = "제목 없음";
       this.author = "저자 미상";
       this.price = 0;
   }
    // 출력 메서드
    public void printInfo() {
        System.out.println("제목: " + title + " / 저자: " + author + " / 가격: " + price);
    }
}
