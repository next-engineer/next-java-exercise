package org.example.basic.leehyemin.unitfive;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("트렌드 코리아 2024", "김난도");
        Book b3 = new Book("일본어 첫걸음", "해커스", 20100);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
