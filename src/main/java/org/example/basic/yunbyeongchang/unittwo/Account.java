package org.example.basic.yunbyeongchang.unittwo;

public class Account {
    //var
    private String accountNumber;        // 계좌번호
    private String ownerName;            // 사용자
    private double balance;             // 액수 (외부에서 값 변경 불가(입출금 함수로만 변경))

    //method
    public Account(String accountNumber, String ownerName, double balance)
    {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount)      // 입금
    {
        this.balance += amount;
        System.out.println(amount + "원 만큼 입금되었습니다.");
    }

    public void withdraw(double amount)    // 출금
    {
        if( this.balance - amount < 0)
        {
            System.out.println("잔액이 부족합니다.");   return;
        }

        this.balance -= amount;
        System.out.println(amount + "원 만큼 출금되었습니다.");

    }

    public void printAccountInfo()          // 계좌정보 출력
    {
        System.out.println("---------------------------------");
        System.out.println("계좌 번호: " + this.accountNumber);
        System.out.println("이름: " + this.ownerName);
        System.out.println("현재 잔고: " + this.balance);
        System.out.println("---------------------------------");
    }

    //getter setter
    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    public double getBalance()
    {
        return this.balance;
    }

}
