package org.example.basic.gojunho.unittwo;

public class AccountProcessor {
    public static void main(String args[]) {
        Account account = new Account("123-456", "고준호", 50000);
        account.printAccountInfo();
        account.deposit(5000);
        account.withdraw(56000);
        account.withdraw(40000);
        account.printAccountInfo();
    }

}
