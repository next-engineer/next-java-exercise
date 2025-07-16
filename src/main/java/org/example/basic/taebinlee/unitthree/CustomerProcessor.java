package org.example.basic.taebinlee.unitthree;

public class CustomerProcessor {
    public static void main(String[] args) {

        // 고객 생성
        Customer customer1 = new Customer("이태빈", "GOLD");
        Customer customer2 = new Customer("김동영", "SILVER");
        Customer customer3 = new Customer("김영자", "BASIC");


        // 구매 가격
        int originalPrice = 10000;

        // 각 고객별 할인된 가격 계산 및 포인트 적립

        int finalPrice1 = customer1.calculateDiscountPrice(originalPrice);
        System.out.println("할인 적용된 가격: " + finalPrice1 + "원");
        customer1.earnPoints(finalPrice1);
        customer1.showCustomerInfo();

        int finalPrice2 = customer2.calculateDiscountPrice(originalPrice);
        System.out.println("\n할인 적용된 가격: " + finalPrice2 + "원");
        customer2.earnPoints(finalPrice2);
        customer2.showCustomerInfo();


        int finalPrice3 = customer3.calculateDiscountPrice(originalPrice);
        System.out.println("\n할인 적용된 가격: " + finalPrice3 + "원");
        customer3.earnPoints(finalPrice3);
        customer3.showCustomerInfo();
    }
}
