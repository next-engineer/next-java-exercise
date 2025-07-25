package org.example.advaned.kimyoungji.uniteight.exercise;

public class CardPaymentFactory extends PaymentFactory {
    protected Payment createPayment() {
        return new CardPayment();
    }
}