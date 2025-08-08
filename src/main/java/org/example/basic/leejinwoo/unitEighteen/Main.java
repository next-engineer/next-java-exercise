package org.example.basic.leejinwoo.unitEighteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<CoffeeOrder> orders = addOrder();

        totalAccount(orders);
    }

    public static List<CoffeeOrder> addOrder(){
        List<CoffeeOrder> orders = new ArrayList<>();

        String stop = "Y";
        Scanner sc = null;
        Scanner stopScanner = null;

        while ("Y".equalsIgnoreCase(stop)){
            try {
                sc = new Scanner(System.in);

                System.out.println("커피 종류를 선택하세요: AMERICANO, LATTE, CAPPUCCINO");
                CoffeeType type = CoffeeType.valueOf(sc.next().toUpperCase());

                System.out.println("사이즈를 선택하세요: SMALL, MEDIUM, LARGE");
                CoffeeSize size = CoffeeSize.valueOf(sc.next().toUpperCase());

                CoffeeOrder order = new CoffeeOrder(type, size);
                order.printOrder();
                orders.add(order);

                stopScanner = new Scanner(System.in);
                System.out.print("계속 주문하시겠습니까? (Y/N) : ");
                stop = stopScanner.nextLine();

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        sc.close();
        stopScanner.close();

        return orders;
    }

    public static void totalAccount(List<CoffeeOrder> orders){
        int total = 0;

        for(CoffeeOrder order : orders){
            total = total + order.getAccount();
        }

        System.out.println("총 금액은 " + total + "원 입니다.");
    }
}
