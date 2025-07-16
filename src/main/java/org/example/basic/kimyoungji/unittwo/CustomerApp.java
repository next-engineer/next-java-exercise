package org.example.basic.kimyoungji.unittwo;

public class CustomerApp {
    public static void main(String[] args) {
        // 고객 생성
        Customer customer1 = new Customer("김영지", "GOLD");
        Customer customer2 = new Customer("이수민", "SILVER");
        Customer customer3 = new Customer("박지훈", "BASIC");

        int productPrice = 100000;

        System.out.println("\n[ GOLD 회원 구매 ]");
        int discountedPrice1 = customer1.calculateDiscountPrice(productPrice);
        System.out.println("할인 적용 가격: " + discountedPrice1 + "원");
        customer1.earnPoints(discountedPrice1);
        customer1.showCustomerInfo();

        System.out.println("\n[ SILVER 회원 구매 ]");
        int discountedPrice2 = customer2.calculateDiscountPrice(productPrice);
        System.out.println("할인 적용 가격: " + discountedPrice2 + "원");
        customer2.earnPoints(discountedPrice2);
        customer2.showCustomerInfo();

        System.out.println("\n[ BASIC 회원 구매 ]");
        int discountedPrice3 = customer3.calculateDiscountPrice(productPrice);
        System.out.println("할인 적용 가격: " + discountedPrice3 + "원");
        customer3.earnPoints(discountedPrice3);
        customer3.showCustomerInfo();
    }
}