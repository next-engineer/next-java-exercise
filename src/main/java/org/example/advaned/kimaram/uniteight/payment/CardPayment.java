package org.example.advaned.kimaram.uniteight.payment;

// 2. 구체적인 결제 클래스 - card
public class CardPayment implements Payment{
    @Override
    public void pay(int amount) {
        double fee = amount * 0.02; // 카드 수수료 2%
        System.out.println("카드 결제 완료. 수수료: " + fee + "원");
    }
}
