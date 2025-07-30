package org.example.basic.yunbyeongchang.uniteight.homework.payment;

public class CreditCardPayment implements Payment{
    //var

    //method
    @Override
    public void pay(int amount)
    {
        System.out.println("현재 카드로 " + amount + "원 결제되었습니다.");
    }
}
