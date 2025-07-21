package org.example.advaned.yunbyeongchang.unitfive.homework;

public class CardPayment implements Payment{
    //method
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제합니다.");
    }
}
