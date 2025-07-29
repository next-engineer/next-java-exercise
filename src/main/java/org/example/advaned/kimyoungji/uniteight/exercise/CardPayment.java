package org.example.advaned.kimyoungji.uniteight.exercise;

public class CardPayment implements Payment {
    public void pay(int amount) {
        double fee = amount * 0.02; // 카드 수수료 2%
        System.out.println("카드 결제 완료. 수수료: " + fee + "원");
    }
}
