package org.example.basic.taebinlee.unitthree;

public class Customer {
    private String name;
    private String grade;
    private int point;


    // 생성자
    public Customer(String name,String grade) {
        this.name = name;
        this.grade = grade;
        this.point = 0;
    }


    // 입력받은 상품 가격에서 회원등급에 따른 할인된 가격 반환
    public int calculateDiscountPrice(int price) {
        int DiscountPrice = price;

        if ( "GOLD".equals(grade) ) {
            DiscountPrice = (int)(price * 0.9);
        }
        else if ( "SILVER".equals(grade) ) {
            DiscountPrice = (int)(price * 0.95);
        }
        else {
            DiscountPrice = price;
        }
        return DiscountPrice;
    }

    // 고객 이름, 등급, 적립 포인트 출력
    public void showCustomerInfo() {
        System.out.println("성함: " + name);
        System.out.println("회원 등급: " + grade);
        System.out.println("적립 포인트: " + point);
    }


    // 포인트 적립
    public void earnPoints(int price) {
        int earnPoint = 0;

        if ("GOLD".equals(grade)) {
            earnPoint = (int)(price * 0.02);
        }
        else if ("SILVER".equals(grade)) {
            earnPoint = (int)(price * 0.01);
        }
        else {
            earnPoint = 0;
        }
        point += earnPoint;
    }
}

