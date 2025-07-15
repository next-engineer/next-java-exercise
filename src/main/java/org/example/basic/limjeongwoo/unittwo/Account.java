package org.example.basic.limjeongwoo.unittwo;

public class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;

    // 생성자
    public Account (String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }


    // 입금
    public void deposit(double amount){
        balance += amount;
    }

    // 출금
    public boolean withdraw(double amount){
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        balance -= amount;
        return true;
    }

    // 계좌 정보 출력
    public void printAccountInfo() {
        System.out.printf("소유자명: %s, 잔액: %.2f\n", ownerName, balance);
    }


}
