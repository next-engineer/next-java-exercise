package org.example.basic.bangjihyun.uniteightteen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ordering = true;

        while (ordering) {
            try {
                System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
                CoffeeType type = CoffeeType.valueOf(sc.next().toUpperCase());

                System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
                CoffeeSize size = CoffeeSize.valueOf(sc.next().toUpperCase());

                CoffeeOrder order = new CoffeeOrder(type, size);
                order.printOrder();


            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                continue; // while 문 처음으로 돌아감
            }

            System.out.println("계속 주문하시겠습니까? (yes/no)");
            String answer = sc.next().toLowerCase();
            if (!answer.equals("yes")) {
                ordering = false;
            }
        }

        System.out.println("주문을 종료합니다.");
        sc.close();
    }
}
