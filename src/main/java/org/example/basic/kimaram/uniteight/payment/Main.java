package org.example.basic.kimaram.uniteight.payment;

public class Main {
    public static void main(String[] args) {
        Payment method;

        // 조건에 따라 다른 결제 방식 사용
        method = new CreditCardPayment();
        method.pay(5000);

        method = new KakaoPay();
        method.pay(7000);
    }
}
