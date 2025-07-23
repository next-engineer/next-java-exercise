package org.example.advaned.kimyoungji.unitfive;

public class PaymentTest {
    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        OrderService orderWithCard = new OrderService(cardPayment);
        orderWithCard.checkout(10000);

        Payment bankTransfer = new BankTransfer();
        OrderService orderWithBank = new OrderService(bankTransfer);
        orderWithBank.checkout(20000);

        Payment pointPayment = new PointPayment();
        OrderService orderWithPoint = new OrderService(pointPayment);
        orderWithPoint.checkout(5000);
    }
}