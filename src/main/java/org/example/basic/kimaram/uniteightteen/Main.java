package org.example.basic.kimaram.uniteightteen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                CoffeeType type = choiceCoffeeType(sc);
                CoffeeSize size = choiceCoffeeSize(sc);

                CoffeeOrder order = new CoffeeOrder(type, size);
                order.printOrder();

                if (!checkReOrder(sc)) {
                    System.out.println("주문을 종료합니다.");
                    break;
                }
            }
        }
    }

    // 커피 종류 선택 메서드
    public static CoffeeType choiceCoffeeType(Scanner sc) {
        while (true) {
            System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
            String input = sc.next().toUpperCase();
            try {
                return CoffeeType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 커피 종류입니다. 다시 입력해주세요.");
            }
        }
    }

    // 커피 사이즈 선택 메서드
    public static CoffeeSize choiceCoffeeSize(Scanner sc) {
        while (true) {
            System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
            String input = sc.next().toUpperCase();
            try {
                return CoffeeSize.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 사이즈입니다. 다시 입력해주세요.");
            }
        }
    }

    // 반복 주문 확인 메서드
    public static boolean checkReOrder(Scanner sc) {
        while (true) {
            System.out.print("계속 주문하시겠습니까? (yes/no): ");
            String input = sc.next().trim().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                return false;
            } else {
                System.out.println("잘못된 입력입니다. 'yes' 또는 'no' 로 입력해주세요.");
            }
        }

    }
}
