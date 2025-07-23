package org.example.basic.sangyoonlee.uniteight.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit card paid: " + amount);
    }
}
