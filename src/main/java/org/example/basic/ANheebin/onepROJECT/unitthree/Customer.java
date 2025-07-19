package org.example.basic.ANheebin.onepROJECT.unitthree;

public class Customer {
    private String name;
    private String grade;
    private int point;

    public Customer(String name, String grade){
        this.name = name;
        this.grade = grade;
        this.point = 0;
    }

    public int calculateDiscountPrice(int price){
        double discountRate = 0.0;

        if(grade.equals("GOLD")){
            discountRate = 0.10;
        }else if(grade.equals("SILVER")){
            discountRate = 0.05;
        }else if (grade.equals("BASIC")) {
            discountRate = 0.0;
        }

        int discountPrice = (int)(price * (1 - discountRate));
        return discountPrice;
    }

    public void showCustomerInfo(){
        System.out.println("고객명: " + name);
        System.out.println("고객등급: " + grade);
        System.out.println("현재 포인트: " + point);
    }

    public static void main(String[] args){
        Customer customer1 = new Customer("홍길동", "GOLD");

        customer1.showCustomerInfo();
        System.out.println("--------------------------------");
        int price = 10000;
        int discountPrice = customer1.calculateDiscountPrice(price);
        System.out.println("할인 적용 전 금액: " + price);
        System.out.println("할인 적용 후 금액: " + discountPrice);
        System.out.println("적립된 포인트: " + (price - discountPrice));
        System.out.println("--------------------------------");
        customer1.showCustomerInfo();

        
    }

}