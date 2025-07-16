package org.example.basic.leeseungyeon.unittwo;

public class Account {
    // 🔐 private 필드
    private String accountNumber;
    private String ownerName;
    private double balance;

    // ✅ 생성자
    public Account(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // 💰 입금 메서드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println(" 입금 금액은 0보다 커야 합니다.");
        }
    }

    // 💸 출금 메서드
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" 출금 금액은 0보다 커야 합니다.");
        } else if (amount > balance) {
            System.out.println(" 잔액이 부족합니다. 현재 잔액: " + balance + "원");
        } else {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }
    }

    // 📄 계좌 정보 출력
    public void printAccountInfo() {
        System.out.println("========== 계좌 정보 ==========");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주: " + ownerName);
        System.out.println("현재 잔액: " + balance + "원");
        System.out.println("===============================");
    }
}
