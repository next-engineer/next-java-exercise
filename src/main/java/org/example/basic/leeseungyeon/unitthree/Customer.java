package org.example.basic.leeseungyeon.unitthree;

public class Customer {
    private String name;
    private String grade;
    private int point;

    public Customer(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public int calculateDiscountPrice(int price) {
        if (grade.equals("GOLD")) {
            return (int)(price * 0.9); // 10% 할인
        } else if (grade.equals("SILVER")) {
            return (int)(price * 0.95); // 5% 할인
        } else {
            return price; // BASIC: 할인 없음
        }
    }

    public void showCustomerInfo() {
        System.out.println("이름: " + name);
        System.out.println("등급: " + grade);
        System.out.println("포인트: " + point);
    }
}
