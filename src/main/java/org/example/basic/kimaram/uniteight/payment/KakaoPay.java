package org.example.basic.kimaram.uniteight.payment;

public class KakaoPay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
