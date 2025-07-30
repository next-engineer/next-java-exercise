package main.java.org.example.advaned.anheebin.uniteight.Payment;

public class CardPayment implements Payment{

    @Override
    public void pay(int amount) {
        double fee = amount * 0.02;
        System.out.println("카드 결제 완료. 수수료: " + fee + "원");
    }
    
}
