package org.example.basic.leejinwoo.unitEight.Payment;

public class PaymentMain {
    public static void main(String[] args) {
        Payment method;

        // 조건에 따라 다른 결제 방식 사용
        method = new CreditCardPayment();
        method.pay(5000);

        method = new KakaoPay();
        method.pay(7000);
    }
}
