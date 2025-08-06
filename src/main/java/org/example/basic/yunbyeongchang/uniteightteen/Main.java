package org.example.basic.yunbyeongchang.uniteightteen;

import java.util.Scanner;

public class Main {
    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
        CoffeeType type = CoffeeType.valueOf(sc.next().toUpperCase());

        System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
        CoffeeSize size = CoffeeSize.valueOf(sc.next().toUpperCase());

        CoffeeOrder order = new CoffeeOrder(type, size);
        order.printOrder();

        sc.close();
    }
}
