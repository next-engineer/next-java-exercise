package org.example.advaned.yunbyeongchang.uniteight.example;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        PaymentFactory cardFactory = new CardPaymentFactory();
        cardFactory.process(10000);                //카드 결제

        PaymentFactory kakaoFactory = new KakaoPayFactory();
        kakaoFactory.process(5000);             //카카오페이 결제
    }
}
