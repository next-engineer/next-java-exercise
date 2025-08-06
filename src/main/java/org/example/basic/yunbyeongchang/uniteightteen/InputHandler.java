package org.example.basic.yunbyeongchang.uniteightteen;

import java.util.Scanner;

public class InputHandler {
    //var

    //method
    public static CoffeeType getCoffeeType(Scanner sc) {
        while (true) {
            System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
            String input = sc.next().trim().toUpperCase();

            try {
                return CoffeeType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
            }
        }
    }

    public static CoffeeSize getCoffeeSize(Scanner sc) {
        while (true) {
            System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
            String input = sc.next().trim().toUpperCase();

            try {
                return CoffeeSize.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
            }
        }
    }

    public static boolean continueOrder(Scanner sc) {
        while (true) {
            System.out.println("주문을 계속하시겠습니까? (y/n)");
            String input = sc.next().trim().toLowerCase();

            switch (input) {
                case "y": return true;
                case "n": return false;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
            }
        }
    }
}
