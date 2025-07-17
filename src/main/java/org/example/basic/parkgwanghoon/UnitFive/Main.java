package org.example.basic.parkgwanghoon.UnitFive;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(); //
        Book book2 = new Book("룬의 아이들", "전민희"); // 2개 매개변수
        Book book3 = new Book("피를 마시는 새, 전권 세트", "이영도", 117000); // 3개 매개변수

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
