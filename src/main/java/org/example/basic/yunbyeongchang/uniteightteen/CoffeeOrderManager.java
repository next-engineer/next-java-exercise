package org.example.basic.yunbyeongchang.uniteightteen;

import java.util.Scanner;

public class CoffeeOrderManager {
    //var
    private final Scanner sc;

    //method
    public CoffeeOrderManager(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        while (true) {
            CoffeeType type = InputHandler.getCoffeeType(sc);
            CoffeeSize size = InputHandler.getCoffeeSize(sc);

            CoffeeOrder order = new CoffeeOrder(type, size);
            order.printOrder();

            if (!InputHandler.continueOrder(sc)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
