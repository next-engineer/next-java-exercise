package org.example.basic.leejinwoo.unitThree;

public class CustomerProcessor {

    public static void main(String[] args) {
        Customer customer = new Customer("A", "GOLD", 0);

        int price = customer.calculateDiscountPrice(1000);
        System.out.println("price : " + price);

        customer.showCustomerInfo(); // 고객 정보 출력
    }
}
