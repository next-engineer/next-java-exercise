package org.example.basic.gojunho.uniteightteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CoffeeType type=null;
        CoffeeSize size=null;
        final int min=0;
        final int max=2;
        for(int num=min;num<=max;num++) {
            System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
            try {
                type = CoffeeType.valueOf(sc.next().toUpperCase());
            } catch (Exception e) {
                System.out.println("올바르지 않은 커피 종류입니다.");
            }

            System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
            try {
                size = CoffeeSize.valueOf(sc.next().toUpperCase());
            } catch (Exception e) {
                System.out.println("올바르지 않은 사이즈입니다.");
            }
            CoffeeOrder order = new CoffeeOrder(type, size);

            order.printOrder();
        }
        sc.close();
    }
}
