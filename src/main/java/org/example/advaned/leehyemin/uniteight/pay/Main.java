package org.example.advaned.leehyemin.uniteight.pay;

public class Main {
    public static void main(String[] args) {
        PaymentFactory card = new CardPaymentFactory();
        card.process(10000);

        PaymentFactory kakao = new KakaoPayFactory();
        kakao.process(10000);
    }
}
