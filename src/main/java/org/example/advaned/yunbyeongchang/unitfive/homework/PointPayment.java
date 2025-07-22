package org.example.advaned.yunbyeongchang.unitfive.homework;

public class PointPayment implements Payment{
    //method
    @Override
    public void pay(int amount) {
        System.out.println("포인트로 " + amount + "원 결제합니다.");
    }
}
