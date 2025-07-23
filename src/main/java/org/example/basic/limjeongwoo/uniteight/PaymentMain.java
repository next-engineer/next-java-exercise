package org.example.basic.limjeongwoo.uniteight;

import java.util.Scanner;

public class PaymentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("결제 수단 선택: ");
        System.out.println("1. 신용카드");
        System.out.println("2. 카카오페이");

        int type = scanner.nextInt();

        Payment method = null;
        
        switch (type) {
            case 1:
                method = new CreditCardPayment();
            case 2:
                method = new KakaoPay();
                break;
        }
        
        method.pay(7000);
    }

}
