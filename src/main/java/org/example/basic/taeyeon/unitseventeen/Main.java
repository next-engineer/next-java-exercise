package org.example.basic.taeyeon.unitseventeen;

import java.util.Scanner;

enum CoffeeType { AMERICANO, LATTE, CAPPUCCINO }
enum CoffeeSize { SMALL, MEDIUM, LARGE }

class CoffeeOrder {
    CoffeeType type;
    CoffeeSize size;

    CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    void printOrder() {
        System.out.println("주문하신 커피는 " + size + " 사이즈 " + type + "입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("커피 종류를 입력하세요 (AMERICANO, LATTE, CAPPUCCINO):");
        CoffeeType type = CoffeeType.valueOf(sc.next().toUpperCase());

        System.out.println("사이즈를 입력하세요 (SMALL, MEDIUM, LARGE):");
        CoffeeSize size = CoffeeSize.valueOf(sc.next().toUpperCase());

        CoffeeOrder order = new CoffeeOrder(type, size);
        order.printOrder();

        sc.close();
    }
}
