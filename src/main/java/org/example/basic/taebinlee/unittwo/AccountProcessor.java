package org.example.basic.taebinlee.unittwo;


// 입금 및 출금 기능구현 메소드
public class AccountProcessor {
    public static void main(String[] args) {

        // 계좌 생성
        Account myAccount = new Account("123456789", "이태빈",55000);
        myAccount.deposit(5000);


        // 입금
        myAccount.deposit(3500);

        // 출금
        myAccount.withdraw(2000);

        // 계좌 정보 출력
        myAccount.printAccountInfo();


    }
}
