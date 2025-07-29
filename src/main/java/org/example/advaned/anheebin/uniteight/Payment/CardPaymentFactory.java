package main.java.org.example.advaned.anheebin.uniteight.Payment;

public class CardPaymentFactory extends PaymentFactory {
    protected Payment createPayment() {
        return new CardPayment();
    }
}
