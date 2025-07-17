package org.example.basic.kimyoungji.unittwo;

public class AccountProcessor {
    public static void main(String[] args) {
        Account myAccount = new Account("123-456", "김영지", 100000);

        myAccount.printAccountInfo();
        myAccount.deposit(50000);
        myAccount.withdraw(30000);
        myAccount.withdraw(150000); // 잔액 부족 예시

        myAccount.printAccountInfo();
    }
}

