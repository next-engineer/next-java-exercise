package org.example.basic.leeseungyeon.unitten.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book(), new Book());
        List<Phone> phones = List.of(new Phone());

        System.out.println("총 책 가격: " + PriceCalculator.calculateTotal(books));
        System.out.println("총 폰 가격: " + PriceCalculator.calculateTotal(phones));
    }
}