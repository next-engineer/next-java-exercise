package org.example.basic.yunbyeongchang.unitten.homework.genericinterface;

import java.util.*;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        List<Book> books = List.of(new Book(), new Book());
        List<Phone> phones = List.of(new Phone());

        System.out.println("책 총합 가격: " + PriceCalculator.calculate(books) + "원");
        System.out.println("핸드폰 총합 가격: " + PriceCalculator.calculate(phones) + "원");
    }
}
