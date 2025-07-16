package org.example.basic.leeseungyeon.unitthree;

public class ShoppingApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("이승연", "GOLD", 1500);
        Customer customer2 = new Customer("박민지", "SILVER", 800);
        Customer customer3 = new Customer("방지현", "BASIC", 300);

        customer1.showCustomerInfo();
        System.out.println("할인가격: " + customer1.calculateDiscountPrice(10000));
        System.out.println();

        customer2.showCustomerInfo();
        System.out.println("할인가격: " + customer2.calculateDiscountPrice(10000));
        System.out.println();

        customer3.showCustomerInfo();
        System.out.println("할인가격: " + customer3.calculateDiscountPrice(10000));
    }
}
