package org.example.advaned.kimaram.uniteight.payment;

// 4. 구체적인 팩토리 클래스 - kakaoPay
public class KakaoPayFactory extends PaymentFactory{
    @Override
    protected Payment createPayment() {
        return new KakaoPay();
    }
}
