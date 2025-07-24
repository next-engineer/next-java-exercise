package org.example.advaned.kimaram.uniteight.payment;

// 2. 구체적인 결제 클래스 - kakaoPay
public class KakaoPay implements Payment{
    @Override
    public void pay(int amount) {
        double fee = 500;   // 고정 수수료
        System.out.println("카카오페이 결제 완료. 수수료: " + fee + "원");
    }
}
