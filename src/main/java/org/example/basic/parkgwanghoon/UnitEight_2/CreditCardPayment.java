package org.example.basic.parkgwanghoon.UnitEight_2;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Credit card paid: " + amount);
    }
}
