package org.example.basic.kimyoungji.unithree;

public class Customer {
    private String name;
    private String grade;  // BASIC, SILVER, GOLD
    private int point;

    // 생성자
    public Customer(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.point = 0;  // 처음엔 포인트 0
    }

    // 가격 할인 계산
    public int calculateDiscountPrice(int price) {
        int discount = 0;

        if (grade.equalsIgnoreCase("GOLD")) {
            discount = (int)(price * 0.10);
        } else if (grade.equalsIgnoreCase("SILVER")) {
            discount = (int)(price * 0.05);
        } // BASIC은 할인 없음

        return price - discount;
    }

    // 포인트 적립 (기본 + 등급별 추가)
    public void earnPoints(int price) {
        int basePoint = (int)(price * 0.01);
        int bonusPoint = 0;

        if (grade.equalsIgnoreCase("GOLD")) {
            bonusPoint = (int)(price * 0.02);
        } else if (grade.equalsIgnoreCase("SILVER")) {
            bonusPoint = (int)(price * 0.01);
        }

        int totalPoint = basePoint + bonusPoint;
        this.point += totalPoint;

        System.out.println(name + " 님께 " + totalPoint + "포인트가 적립되었습니다.");
    }

    // 고객 정보 출력
    public void showCustomerInfo() {
        System.out.println("이름: " + name);
        System.out.println("등급: " + grade);
        System.out.println("보유 포인트: " + point);
    }
}