package org.example.basic.limjeongwoo.unitthree;

public class CustomerProcessor {

    public static void main(String[] args) {
        Customer customer = new Customer("임정우", "SILVER",5);

        int discountPrice = customer.calculateDiscountPrice(10000);

        System.out.println("할인된 가격: " + discountPrice);

        customer.earnPoints(discountPrice);

        customer.showCustomerInfo();

    }

}
