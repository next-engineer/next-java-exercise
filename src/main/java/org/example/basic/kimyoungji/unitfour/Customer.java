package org.example.basic.kimyoungji.unitfour;

public class Customer {
    private String name;
    private String grade; // BASIC, SILVER, GOLD
    private int point;

    // 생성자
    public Customer(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.point = 0; // 초기 포인트는 0
    }

    // 1. 할인된 가격 계산 (if-else 사용)
    public int calculateDiscountPrice(int price) {
        int discount = 0;

        if (grade.equalsIgnoreCase("GOLD")) {
            discount = (int)(price * 0.10); // 10% 할인
        } else if (grade.equalsIgnoreCase("SILVER")) {
            discount = (int)(price * 0.05); // 5% 할인
        }
        // BASIC은 할인 없음

        return price - discount;
    }

    // 2. 포인트 적립 (기본 + 등급별 추가 포인트)
    public void earnPoints(int price) {
        int basePoint = (int)(price * 0.01); // 1% 기본 적립
        int bonusPoint = 0;

        if (grade.equalsIgnoreCase("GOLD")) {
            bonusPoint = (int)(price * 0.02); // 추가 2%
        } else if (grade.equalsIgnoreCase("SILVER")) {
            bonusPoint = (int)(price * 0.01); // 추가 1%
        }

        int totalEarned = basePoint + bonusPoint;
        this.point += totalEarned;
        System.out.println(name + " 님에게 " + totalEarned + " 포인트가 적립되었습니다.");
    }

    // 3. 고객 정보 출력
    public void showCustomerInfo() {
        System.out.println("=== 고객 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("등급: " + grade);
        System.out.println("포인트: " + point + "점");
    }
}