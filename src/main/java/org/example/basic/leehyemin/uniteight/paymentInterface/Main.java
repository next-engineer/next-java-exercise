package org.example.basic.leehyemin.uniteight.paymentInterface;

public class Main {
    public static void main(String[] args) {
        Payment method;

        method = new CreditCardPayment();
        method.pay(5000);

        method = new KaKaoPay();
        method.pay(500000);

        method = new TossPay();
        method.pay(26400);
    }
}
