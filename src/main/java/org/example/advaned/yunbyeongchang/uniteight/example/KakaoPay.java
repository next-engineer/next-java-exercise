package org.example.advaned.yunbyeongchang.uniteight.example;

public class KakaoPay implements Payment{
    //var

    //method
    public void pay(int amount)
    {
        double fee = 500; // 고정 수수료
        System.out.println("카카오페이 결제 " + amount + "원 완료, 수수료: " + fee + "원");
    }
}
