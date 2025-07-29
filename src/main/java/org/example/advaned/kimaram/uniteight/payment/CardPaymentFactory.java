package org.example.advaned.kimaram.uniteight.payment;

// 4. 구체적인 팩토리 클래스 - card
public class CardPaymentFactory extends PaymentFactory{
    @Override
    protected Payment createPayment() {
        return new CardPayment();
    }
}
