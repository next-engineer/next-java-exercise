package org.example.basic.leeseungyeon.unittwo;

public class AccountProcessor {
    public static void main(String[] args) {
        // 🏦 계좌 생성
        Account account = new Account("123-456-7788", "이승연", 10000);

        // 🧾 계좌 정보 출력
        account.printAccountInfo();

        // ✅ 입금 & 출금 테스트
        account.deposit(5000);      // +5000
        account.withdraw(3000);     // -3000
        account.withdraw(20000);    //  잔액 부족

        // 🔄 최종 정보 출력
        account.printAccountInfo();
    }
}
