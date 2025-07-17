package org.example.basic.kimyoungji.unitfour;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("김지민", "GOLD");
        Customer customer2 = new Customer("이유진", "SILVER");
        Customer customer3 = new Customer("박수연", "BASIC");

        int price = 100000; // 상품 가격

        System.out.println("[ GOLD 회원 ]");
        int goldPrice = customer1.calculateDiscountPrice(price);
        System.out.println("할인된 가격: " + goldPrice + "원");
        customer1.earnPoints(goldPrice);
        customer1.showCustomerInfo();

        System.out.println("\n[ SILVER 회원 ]");
        int silverPrice = customer2.calculateDiscountPrice(price);
        System.out.println("할인된 가격: " + silverPrice + "원");
        customer2.earnPoints(silverPrice);
        customer2.showCustomerInfo();

        System.out.println("\n[ BASIC 회원 ]");
        int basicPrice = customer3.calculateDiscountPrice(price);
        System.out.println("할인된 가격: " + basicPrice + "원");
        customer3.earnPoints(basicPrice);
        customer3.showCustomerInfo();
    }
}