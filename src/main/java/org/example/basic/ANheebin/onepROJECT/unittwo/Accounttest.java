package org.example.basic.ANheebin.onepROJECT.unittwo;

public class Accounttest {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Accounttest(String accountNumber, String ownerName, double balance){
        this.accountNumber=accountNumber;//계자
        this.ownerName=ownerName;//예금주
        this.balance=balance;//잔액액
    }

    //입급급
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+"원이 입금되었습니다.");
        }else{
            System.out.println("입금 금액이 유효하지 않습니다.");
        }
    }

    public void withdraw(double amount){
        if (amount<= 0){
            System.out.println("출금 금액이 유효하지 않습니다.");
        }else if(amount>balance){
            System.out.println("잔액이 부족합니다.");
        }else{
            balance-=amount;
            System.out.println(amount+"원이 출금되었습니다.");
        }
    }



    public void printAccountInfo(){
        System.out.println("계좌번호: "+accountNumber);
        System.out.println("예금주: "+ownerName);
        System.out.println("잔액액: "+balance+"원원");
    }

    public String getaccountNumber(){
        return accountNumber;
    }

    public String getownerName(){
        return ownerName;
    }  

    public double getbalance(){
        return balance;
    }

/* deposit(double amount) — 입금
withdraw(double amount) — 출금
printAccountInfo()*/    

    public static void main(String[] args) {
        Accounttest acc = new Accounttest("123-456-9852", "홍길동", 500000);
        acc.printAccountInfo();


        System.out.println("\n[입금 테스트]");
        acc.deposit(30000);
    
        System.out.println("\n[출금 테스트]");
        acc.withdraw(20000);
    
        System.out.println("\n[출금 실패 테스트]");
        acc.withdraw(100000); // 잔액 초과
    
        System.out.println("\n[최종 계좌 정보]");
        acc.printAccountInfo();

    }
}