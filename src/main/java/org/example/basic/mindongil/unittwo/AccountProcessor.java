package org.example.basic.mindongil.unittwo;

import java.util.Scanner;

public class AccountProcessor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("계좌 번호 입력: ");
        String accountNumber = input.nextLine();
        System.out.print("예금주명 입력: ");
        String ownerName = input.nextLine();
        System.out.print("잔액 입력: ");
        double balance = input.nextDouble();

        Account account = new Account(accountNumber, ownerName, balance);

        //입금
        account.deposit(1000000);
        System.out.println();

        //정보출력
        account.printAccount();

        //출금
        account.deposit(500000);

        //정보출력
        account.printAccount();


    }

}