package org.example.basic.kimdonghyun.unitEight._2;

public class Main {
    public static void main(String[] args) {
        Payment method;

        // 조건 1: 신용카드 결제
        method = new CreditCardPayment();
        method.pay(5000);  // 출력: Credit card paid: 5000

        // 조건 2: 카카오페이 결제
        method = new KakaoPay();
        method.pay(7000);  // 출력: KakaoPay paid: 7000
    }
