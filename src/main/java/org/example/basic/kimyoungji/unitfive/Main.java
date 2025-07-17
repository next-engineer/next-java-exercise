package org.example.basic.kimyoungji.unitfive;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java 프로그래밍", "홍길동");
        Book b3 = new Book("자료구조", "김철수", 25000);

        b1.printInfo();  // 제목: 제목 없음 / 저자: 저자 미상 / 가격: 0원
        b2.printInfo();  // 제목: Java 프로그래밍 / 저자: 홍길동 / 가격: 0원
        b3.printInfo();  // 제목: 자료구조 / 저자: 김철수 / 가격: 25000원
    }
}