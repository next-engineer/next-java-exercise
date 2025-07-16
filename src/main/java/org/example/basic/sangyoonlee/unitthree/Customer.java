package org.example.basic.sangyoonlee.unitthree;

public class Customer {
    private final String name;
    private final String grade;
    private int point;

    public Customer(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public void showCustomerInfo() {
        System.out.println("이름: " + name);
        System.out.println("등급: " + grade);
        System.out.println("포인트: " + point);
        System.out.println();
    }

    public int calculateDiscountPrice(int price) {
        if ("SILVER".equals(grade)) {
            point = point + 1;
            return (price * 95) / 100;
        }
        if ("GOLD".equals(grade)) {
            point = point + 2;
            return (price * 90) / 100;
        }
        return price;
    }
}
