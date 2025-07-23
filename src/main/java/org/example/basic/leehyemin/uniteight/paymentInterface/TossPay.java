package org.example.basic.leehyemin.uniteight.paymentInterface;

public class TossPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("토스 페이 결제 : "+amount);
    }
}
