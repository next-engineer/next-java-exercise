package org.example.basic.mindongil.unittwo;

public class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //deposit과 withdraw를 통해서만 balance 변경 가능.
    //입금
    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");
        }
        balance += amount;
        return balance;
    }

    //출금
    public double withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금액은 0보다 커야 합니다.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("잔액이 부족하여 출금할 수 없습니다.");
        }
        balance -= amount;
        return balance;
    }

    //계좌 정보 출력
    public void printAccount() {
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("예금주명: " + ownerName);
        System.out.println("잔액: " + balance);
    }

}
