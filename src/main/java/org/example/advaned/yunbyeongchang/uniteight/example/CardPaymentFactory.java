package org.example.advaned.yunbyeongchang.uniteight.example;

public class CardPaymentFactory extends PaymentFactory{
    //var

    //method
    @Override
    protected Payment createPayment() {
        return new CardPayment();
    }
}
