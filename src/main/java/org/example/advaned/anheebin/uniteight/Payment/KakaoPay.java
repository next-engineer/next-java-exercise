package main.java.org.example.advaned.anheebin.uniteight.Payment;

public class KakaoPay implements Payment {
    public void pay(int amount) {
        double fee = 500; // 고정 수수료
        System.out.println("카카오페이 결제 완료. 수수료: " + fee + "원");
    }
}
