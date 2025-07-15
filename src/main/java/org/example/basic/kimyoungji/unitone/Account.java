package org.example.basic.kimyoungji.unitone;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("잘못된 입금 금액입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액 부족 또는 잘못된 금액입니다.");
        }
    }

    public void printAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주명: " + ownerName);
        System.out.println("현재 잔액: " + balance + "원");
    }

}
