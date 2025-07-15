package org.example.basic.mindongil.unitthree;

import java.util.Objects;

public class Customer {
    private String name;
    private String grade;
    private int point;

    Customer(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    // 가격 할인
    public int calculateDiscountPrice(int price) {
        int discountPrice = price;

        if (Objects.equals(this.grade, "basic")) {
            discountPrice = price;
        } else if (Objects.equals(this.grade, "silver")) {
            discountPrice = (int) (price - (price * 0.05));
        } else if (Objects.equals(this.grade, "gold")) {
            discountPrice = (int) (price - (price * 0.1));
        }

        return discountPrice;
    }

    // 고객 정보 출력
    public void showCustomerInfo() {
        System.out.println("이름: " + name);
        System.out.println("등급: " + grade);
        System.out.println("포인트: " + point);
    }

    // 포인트 적립
    public void earnPoints(int price) {
        int earned = (int)(price * 0.01);

        if (Objects.equals(this.grade, "silver")) {
            earned += (int)(price * 0.01);  // 추가 1%
        } else if (Objects.equals(this.grade, "gold")) {
            earned += (int)(price * 0.02);
        }

        this.point += earned;
        System.out.printf("적립된 포인트: %d, 총 포인트: %d\n", earned, this.point);
    }
}