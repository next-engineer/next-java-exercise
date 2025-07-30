package org.example.basic.yunbyeongchang.uniteight.homework.payment;

public class KakaoPay implements Payment{
    //var

    //method
    @Override
    public void pay(int amount)
    {
        System.out.println("카카오페이로 " + amount + "원 결제되었습니다.");
    }
}
