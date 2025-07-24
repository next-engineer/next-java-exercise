package org.example.advaned.gojunho.uniteight.Payment;

public class CardPaymentFactory extends PaymentFactory{
    @Override
    protected Payment createPayment() {
        return new CardPayment();
    }
}
