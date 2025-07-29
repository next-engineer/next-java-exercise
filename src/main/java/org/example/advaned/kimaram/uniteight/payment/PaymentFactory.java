package org.example.advaned.kimaram.uniteight.payment;

// 3. 추상 클래스 (Factory Method)
public abstract class PaymentFactory {
    public void process(int amount) {
        Payment payment = createPayment();      // 팩토리 메서드 호출
        payment.pay(amount);
    }

    protected abstract Payment createPayment(); // 팩토리 메서드
}
