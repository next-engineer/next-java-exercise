package org.example.advaned.yunbyeongchang.unitfive.homework;

public class OrderService {
    //var
    private CardPayment cardPayment = new CardPayment();

    //method
    public void checkout(int amount) {
        cardPayment.pay(amount);
    }
}
