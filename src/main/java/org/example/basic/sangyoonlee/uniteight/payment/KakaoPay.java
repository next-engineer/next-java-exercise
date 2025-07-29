package org.example.basic.sangyoonlee.uniteight.payment;

public class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
