package org.example.basic.gojunho.unittwo;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName=ownerName;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("입금: "+amount+" 잔액: "+balance);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("출금: "+amount+" 잔액: "+balance);
            }
        else{
            System.out.println("잔액이 부족합니다");
        }
    }
    public void printAccountInfo(){
        System.out.println("이름:"+ownerName+" 계좌번호:"+ownerName+" 잔액:"+balance);
    }
}
