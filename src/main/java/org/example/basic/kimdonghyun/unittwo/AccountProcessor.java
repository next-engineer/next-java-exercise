package org.example.basic.kimdonghyun.unittwo;

import java.sql.SQLOutput;

public class AccountProcessor {
    public static void main(String[] args) {
        Account myAccount = new Account("123-456-7890", "Toryong", 500000);

        myAccount.printAccountInfo();
        System.out.println();

        myAccount.deposit(50000);
        myAccount.withdraw(30000);
        myAccount.withdraw(99999999); //잔액부족테스트
        System.out.println();


        myAccount.printAccountInfo();

    }
}
