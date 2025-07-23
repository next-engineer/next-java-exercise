package org.example.basic.leehyemin.uniteight.paymentInterface;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("신용 카드 결제 : "+amount);
    }
}
