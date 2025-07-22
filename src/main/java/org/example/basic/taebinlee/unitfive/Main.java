package org.example.basic.taebinlee.unitfive;

// 메인 메소드로 작동 확인
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("시지프 신화", "알베르 카뮈");
        Book book3 = new Book("점프 투 파이썬", "박응용", 32000);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}

