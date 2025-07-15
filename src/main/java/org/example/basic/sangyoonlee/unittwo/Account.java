package org.example.basic.sangyoonlee.unittwo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Account {
    private final String accountNumber;
    private final String ownerName;
    private BigDecimal balance;

    public Account(String accountNumber, String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    private static String formatDecimal(BigDecimal value) {
        BigDecimal balanceValue = value.setScale(2, RoundingMode.HALF_UP);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        return formatter.format(balanceValue) + " $";
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        String formattedBalance = formatDecimal(amount);
        System.out.println(formattedBalance + "입금완료");
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        String formattedBalance = formatDecimal(amount);
        System.out.println(formattedBalance + "출금완료");
    }

    public void printAccountInfo() {
        String formattedBalance = formatDecimal(balance);

        System.out.println("계좌번호: " + accountNumber);
        System.out.println("계좌주: " + ownerName);
        System.out.println("잔액: " + formattedBalance);
    }
}
