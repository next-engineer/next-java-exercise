package org.example.basic.parkgwanghoon.UnitEight_2;

public class Main {
    public static void main(String[] args) {
        Payment method;

        method = new CreditCardPayment();
        method.pay(5000);

        method = new KakaoPay();
        method.pay(7000);
    }
}
