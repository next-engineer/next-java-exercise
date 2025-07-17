package org.example.basic.sangyoonlee.unittwo;

import java.math.BigDecimal;

public class AccountProcessor {
    public static void main(String[] args) {
        Account account = new Account("123-456-789101", "Elon Musk", new BigDecimal("432000000000.00"));

        account.printAccountInfo();
        System.out.println();

        account.deposit(new BigDecimal("2527567515.98"));
        System.out.println();

        account.printAccountInfo();
        System.out.println();

        account.withdraw(new BigDecimal("2527567515.98"));
        System.out.println();

        account.printAccountInfo();
        System.out.println();
    }
}
