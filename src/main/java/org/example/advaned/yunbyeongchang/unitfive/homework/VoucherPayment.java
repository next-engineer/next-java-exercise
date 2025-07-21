package org.example.advaned.yunbyeongchang.unitfive.homework;

public class VoucherPayment implements Payment{
    //method
    @Override
    public void pay(int amount) {
        System.out.println("상품권으로 " + amount + "원 결제합니다.");
    }
}
