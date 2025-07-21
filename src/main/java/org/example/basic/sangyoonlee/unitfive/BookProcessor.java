package org.example.basic.sangyoonlee.unitfive;

public class BookProcessor {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("바보이반", "톨스토이");
        Book book3 = new Book("바보이반", "톨스토이", 10000);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
