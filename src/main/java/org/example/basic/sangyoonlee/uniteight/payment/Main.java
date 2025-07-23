package org.example.basic.sangyoonlee.uniteight.payment;

public class Main {
    public static void main(String[] args) {
        Payment method;

        method = new CreditCardPayment();
        method.pay(5000);

        method = new KakaoPay();
        method.pay(7000);
    }
}
