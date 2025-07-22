package org.example.basic.gojunho.uniteight;

public class PaymentMain {
    public static void main(String[] args){
        Payment method;

        method=new CreditCardPayment();
        method.pay(5000);

        method=new KakaoPay();
        method.pay(7000);
    }
}
