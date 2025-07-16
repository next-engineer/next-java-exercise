package org.example.basic.kimaram.unittwo;

public class AccountProcessor {
    public static void main(String[] args) {
        Account account = new Account("12344-22323123", "Alex", 0.0);

        account.deposit(52344);
        account.withdraw(555555);
        account.withdraw(34341);
    }
}
