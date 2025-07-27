package org.example.advaned.anheebin.uniteight.Payment;

public class main {
    public static void main(String[] args) {
        PaymentFactory factory1 = new CardPaymentFactory();
        factory1.process(10000); // 카드 결제

        PaymentFactory factory2 = new KakaoPayFactory();
        factory2.process(10000); // 카카오페이 결제
    }
}
