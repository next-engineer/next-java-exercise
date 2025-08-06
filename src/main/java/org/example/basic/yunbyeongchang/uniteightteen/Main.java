package org.example.basic.yunbyeongchang.uniteightteen;

import java.util.Scanner;

public class Main {
    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeType type = null;
        CoffeeSize size = null;

        try {
            System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
            type = CoffeeType.valueOf(sc.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            sc.close();
            return;
        }

        try {
            System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
            size = CoffeeSize.valueOf(sc.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            sc.close();
            return;
        }

        CoffeeOrder order = new CoffeeOrder(type, size);
        order.printOrder();

        sc.close();
    }
}
