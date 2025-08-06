package org.example.basic.limjeongwoo.uniteighteen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
                CoffeeType type = CoffeeType.valueOf(sc.next().toUpperCase());

                System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
                CoffeeSize size = CoffeeSize.valueOf(sc.next().toUpperCase());

                CoffeeOrder order = new CoffeeOrder(type, size);
                order.printOrder();
            } catch (IllegalArgumentException e) {
                System.out.println("다시 입력해주세요.");
                sc.nextLine();
                continue;
            }

            System.out.println("추가 주문 하시겠습니까? (YES/NO):");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("NO")) {
                break;
            }
        }
        sc.close();
        System.out.println("주문이 완료되었습니다.");
    }
}
