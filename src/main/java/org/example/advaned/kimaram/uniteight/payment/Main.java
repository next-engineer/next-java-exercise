package org.example.advaned.kimaram.uniteight.payment;

public class Main {
    public static void main(String[] args) {
        PaymentFactory cardFactory = new CardPaymentFactory();
        cardFactory.process(10000);     // 카드 결제: 200.0원

        PaymentFactory kakaoFactory = new KakaoPayFactory();
        kakaoFactory.process(10000);    // 카카오페이 결제 : 500.0원

    }
}
