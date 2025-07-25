package org.example.advaned.kimyoungji.uniteight.exercise;


public class KakaoPay implements Payment {
    public void pay(int amount) {
        double fee = 500; // 고정 수수료
        System.out.println("카카오페이 결제 완료. 수수료: " + fee + "원");
    }
}
