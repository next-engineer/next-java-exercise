package org.example.basic.taeyeon.unittwo;

// 메인에서 사용자 선택 시뮬레이션
class main {
    public static void main(String[] args) {
        Payment method;

        // 조건에 따라 다른 결제 방식 사용
        method = new CreditCardPayment();
        method.pay(5000);

        method = new KakaoPay();
        method.pay(7000);
    }
}
