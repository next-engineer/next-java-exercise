package org.example.advaned.parkgwanghoon.unittwo;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("김부자", "GOLD");

        int price = 10000;

        System.out.println("=== 결제내역 ===");
        int finalPrice = customer.calculateDiscountPrice(price);
        System.out.println("할인가: ￦" + finalPrice);
        customer.earnPoints(finalPrice);
        System.out.println("=== 고객 정보 ===");
        customer.showCustomerInfo();
    }
}
