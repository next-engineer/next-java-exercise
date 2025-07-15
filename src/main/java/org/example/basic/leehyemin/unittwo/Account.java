package org.example.basic.leehyemin.unittwo;

public class Account {
    private String accountNumber; //계좌번호
    private String ownerName; //계좌주
    private double balance; //잔액

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    //입금 메소드(amount : 금액)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("이체 금액 : "+amount+"원");
        System.out.println("계좌 총금액 : "+balance+"원");
    }
    //출금 메소드
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("출금 금액 : "+amount+"원");
        System.out.println("계좌 총금액 : "+balance+"원");
    }
}
