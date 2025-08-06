package org.example.basic.leeseungyeon.uniteighteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeOrderManager {
    private final Scanner scanner = new Scanner(System.in);
    private final List<CoffeeOrder> orders = new ArrayList<>();

    public void startOrderSystem() {
        System.out.println("Welcome to Coffee Order System!");

        while (true) {
            try {
                displayMenu();
                CoffeeOrder order = createOrder();
                orders.add(order);
                order.printDetails();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            if (!askToContinue()) {
                break;
            }
        }

        printSummary();
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("Coffee Types:");
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println("- " + type);
        }

        System.out.println("\nSizes:");
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println("- " + size);
        }
        System.out.println("============");
    }

    private CoffeeOrder createOrder() {
        System.out.print("Select coffee type: ");
        String typeInput = scanner.next();
        CoffeeType type = CoffeeType.fromInput(typeInput);

        System.out.print("Select size: ");
        String sizeInput = scanner.next();
        CoffeeSize size = CoffeeSize.fromInput(sizeInput);

        return new CoffeeOrder(type, size);
    }

    private boolean askToContinue() {
        System.out.print("Would you like to make another order? (y/n): ");
        String input = scanner.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    private void printSummary() {
        if (orders.isEmpty()) {
            System.out.println("\nNo orders placed.");
            return;
        }

        System.out.println("\n=== Order Summary ===");
        int total = 0;
        for (int i = 0; i < orders.size(); i++) {
            CoffeeOrder order = orders.get(i);
            System.out.println((i + 1) + ". " + order.getSummaryLine());
            total += order.getTotalPrice();
        }
        System.out.println("Total orders: " + orders.size());
        System.out.println("Total amount: " + total + " won");
        System.out.println("Thank you for your order!");
    }
}

