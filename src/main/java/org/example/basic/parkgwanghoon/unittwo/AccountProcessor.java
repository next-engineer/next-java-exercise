package org.example.advanced.parkgwanghoon.unitone;

public class AccountProcessor {
        public static void main(String[] args) {
            // 계좌 생성
            Account myAccount = new Account("123-456-789", "홍길동");

            // 계좌 정보 출력
            myAccount.printAccountInfo();
            System.out.println("--------------");

            // 입금 및 출금 테스트
            myAccount.deposit(50000);     // 입금
            myAccount.withdraw(10000);    // 출금
            myAccount.withdraw(100000);   // 잔액 부족
            myAccount.deposit(-500);      // 잘못된 입금

            System.out.println("--------------");
            myAccount.printAccountInfo(); // 최종 계좌 정보
        }
}
