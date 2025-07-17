package org.example.basic.sangyoonlee.unitthree;

public class CustomerProcessor {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Elon Musk", "GOLD", 10000);
        Customer customer2 = new Customer("Donald Trump", "SILVER", 1000);

        customer1.showCustomerInfo();
        int price1 = 10000000;
        int discountedPrice1 = customer1.calculateDiscountPrice(price1);
        System.out.println("가격: " + price1);
        System.out.println("할인: " + (price1 - discountedPrice1));
        System.out.println("결제금액: " + discountedPrice1);
        System.out.println();
        customer1.showCustomerInfo();

        customer2.showCustomerInfo();
        int price2 = 1000000;
        int discountedPrice2 = customer2.calculateDiscountPrice(price2);
        System.out.println("가격: " + price2);
        System.out.println("할인: " + (price2 - discountedPrice2));
        System.out.println("결제금액: " + discountedPrice2);
        System.out.println();
        customer2.showCustomerInfo();
    }
}
