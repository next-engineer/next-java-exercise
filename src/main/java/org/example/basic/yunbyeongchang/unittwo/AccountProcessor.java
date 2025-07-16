package org.example.basic.yunbyeongchang.unittwo;

public class AccountProcessor {

    public static void main(String[] args)
    {
        Account man = new Account("11991234", "man", 1000);

        man.printAccountInfo();

        man.deposit(10000);

        man.printAccountInfo();

        man.withdraw(20000);

        man.withdraw(5000);

        man.printAccountInfo();
    }
}
