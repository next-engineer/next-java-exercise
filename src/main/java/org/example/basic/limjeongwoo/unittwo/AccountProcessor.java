package org.example.basic.limjeongwoo.unittwo;

public class AccountProcessor {

    public static void main(String[] args) {

        Account account = new Account("1", "임정우");

        account.deposit(100000);
        account.withdraw(150000);
        account.withdraw(50000);

        account.printAccountInfo();
    }

}
