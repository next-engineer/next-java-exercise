package org.example.basic.leehyemin.unittwo;

import java.util.Scanner;

public class AccountProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account account=new Account("1234-123-1212","이혜민",2000);
        
        System.out.println("입금할 금액을 입력하세요.");
        double amount=sc.nextDouble();
        account.deposit(amount);

        System.out.println("출금할 금액을 입력하세요.");
        double amount1 =sc.nextDouble();
        if(account.getBalance()> amount1){
            account.withdraw(amount1);
        } else {
            System.out.println("출금 가능 금액 부족");
        }
    }
}
