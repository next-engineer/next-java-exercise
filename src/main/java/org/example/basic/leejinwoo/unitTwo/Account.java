package org.example.basic.leejinwoo.unitTwo;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(
            String accountNumber,
            String ownerName,
            double balance
    ){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public static void main(String[] args){
        Account account = new Account("2222", "leejinwoo", 0);//출금
        AccountProcessor(account);
    }

    public static void AccountProcessor(Account account){
        account.balance = deposit(2000); //입금
        withdraw(3000, account); //출금

        System.out.println("accountNumber : " + account.accountNumber);
        System.out.println("ownerName : " + account.ownerName);
        System.out.println("balance : " + account.balance);
    }

    public static double deposit(double amount){
        return amount;
    }

    public static void withdraw(double amount, Account account){
        double amountValue = account.balance;
        try {
            if(amountValue < amount){
                System.out.println("--------잔액 부족--------");
            }else{
                account.balance = amountValue - amount;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
