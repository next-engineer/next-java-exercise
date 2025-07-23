package org.example.basic.parkgwanghoon.UnitEight_2;

public class KakaoPay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
