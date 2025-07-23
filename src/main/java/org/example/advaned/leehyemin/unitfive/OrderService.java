package org.example.advaned.leehyemin.unitfive;

//Payment 인터페이스에 의존하도록 변경, 생성자 주입을 통해 의존성 주입.
//생성자 주입 : OrderService 클래스가 사용할 결제 수단을 생성자를 통해 외부에서 받아오게 하라는 말
//결제 클래스를 직접 의존하지 않고 인터페이스에 의존
public class OrderService {
    private final Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int mount) {
        payment.pay(mount);
    }
}
