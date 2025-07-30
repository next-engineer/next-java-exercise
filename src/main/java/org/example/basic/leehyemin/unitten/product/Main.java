package org.example.basic.leehyemin.unitten.product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book(), new Book(), new Book(), new Book());
        List<Phone>  phones = List.of(new Phone());

        System.out.println("총 도서 가격 : "+PriceCalculator.calculateTotal(books));
        System.out.println("총 핸드폰 가격 : "+PriceCalculator.calculateTotal(phones));
    }
}
