package org.example.advaned.yunbyeongchang.uniteight.example;

public class CardPayment implements Payment{
    //var

    //method
    public void pay(int amount)
    {
        double fee = amount * 0.02; // 2% 카드 수수료
        System.out.println("카드 결제 " + amount + "원 완료, 수수료: " + fee + "원");
    }
}
