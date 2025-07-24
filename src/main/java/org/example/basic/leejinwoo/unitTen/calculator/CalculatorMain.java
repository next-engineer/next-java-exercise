package org.example.basic.leejinwoo.unitTen.calculator;

import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book(), new Book());
        List<Phone> phones = List.of(new Phone());

        System.out.println("총 책 가격: " + PriceCalculator.calculateTotal(books));
        System.out.println("총 폰 가격: " + PriceCalculator.calculateTotal(phones));
    }
}
