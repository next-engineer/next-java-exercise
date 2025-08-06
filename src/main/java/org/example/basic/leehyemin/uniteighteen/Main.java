package org.example.basic.leehyemin.uniteighteen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        CoffeeSize size = CoffeeSize.MEDIUM;
//        System.out.println("컵 용량 : "+size.getMl()+"ml");

        Scanner sc = new Scanner(System.in);

        System.out.println("주문하실 음료 갯수를 입력해주세요.");
        int num =  sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            CoffeeType type = null;
            CoffeeSize size = null;

            while(true) {
                System.out.println("커피 종류를 선택하세요 : AMERICANO, LATTE, CAPPUCCINO");
                String inputType = sc.nextLine();
                try {
                    type = CoffeeInputValidator.getCoffeeType(inputType);
                    break;
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                System.out.println("사이즈를 선택하세요 : SMALL, MEDIUM, LARGE");
                String inputSize = sc.nextLine();
                try {
                    size = CoffeeInputValidator.getCoffeeSize(inputSize);
                    break;
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
            }

            CoffeeExtraPrice extraPrice = CoffeeExtraPrice.valueOf(size.name());
            CoffeeOrder order = new CoffeeOrder(type, size, extraPrice, i);
            order.printOrder();
        }
        sc.close();
    }
}
