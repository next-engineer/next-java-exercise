package org.example.basic.mindongil.uniteight;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit card paid: " + amount);
    }
}
