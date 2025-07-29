package org.example.basic.mindongil.unitfive;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("해리포터", "J.K. 롤링");
        Book book3 = new Book("해리포터", "J.K. 롤링", 30000);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
