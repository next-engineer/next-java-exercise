package org.example.basic.kimaram.unittwo;

public class Account {
    private String accountNumber;
    private String ownerName;
    private Double balance;

    // 생성자
    public Account(String accountNumber, String ownerName, Double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        System.out.println("계좌 정보");
        this.printAccountInfo();
    }

    // 입금 메소드
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " 입금 되었습니다.");
        this.printAccountInfo();
    }

    // 출금 메소드
    public void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("잔액이 부족합니다.");
            this.printAccountInfo();
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " 출금 되었습니다.");
        this.printAccountInfo();
    }

    // 계좌 정보 출력
    public void printAccountInfo() {
        System.out.println("계좌번호 : "+ this.accountNumber + ", 예금주 : " + this.ownerName + ", 잔액 : "+ this.balance +"\n");
    }

}
