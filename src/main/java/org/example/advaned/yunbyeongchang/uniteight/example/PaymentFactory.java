package org.example.advaned.yunbyeongchang.uniteight.example;

public abstract class PaymentFactory {
    //var

    //method
    public void process(int amount)
    {
        Payment payment = createPayment();  //팩토리 메서드 호출
        payment.pay(amount);                //비즈니스 로직 수행
    }

    protected abstract  Payment createPayment();    //팩토리 메서드
}
