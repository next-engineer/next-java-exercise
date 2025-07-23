package org.example.basic.leejinwoo.unitFive;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.printInfo(); //기본 생성자 출력

        book = new Book("Book Name", "A");
        book.printInfo(); //변수 2개 지정 출력

        book = new Book("Book Name2", "B", 1000);
        book.printInfo(); //변수 3개 지정 출력
    }
}
