package org.example.basic.parkgwanghoon.UnitTwo;
public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // 생성자
    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // 입금 메서드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("￦ " + amount + " 이 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 출금 메서드
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("유효하지 않은 금액입니다.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("￦ " + amount + " 이 출금되었습니다.");
        } else {
            System.out.println("잔액 부족");
        }
    }

    // 계좌 정보 출력
    public void printAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주명: " + ownerName);
        System.out.println("잔액: ￦" + balance);
    }
}
