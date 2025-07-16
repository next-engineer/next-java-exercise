package org.example.basic.kimaram.unitthree;

public class Customer {
    private String name;
    private String grade;
    private int point;

    // 생성자
    public Customer(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    // 할인 가격 반환 메서드
    // Basic: 할인 없음, Silver: 5% 할인, Gold: 10%할인
    public int calculateDiscountPrice(int price) {
        if(grade.equalsIgnoreCase("BASIC")) {
            System.out.println(name+"님은 BASIC 회원입니다.");
            return price;
        } else if(grade.equalsIgnoreCase("SILVER")) {
            System.out.println(name+"님은 SILVER 회원입니다.");
            return (int)(price * 0.95);
        } else if(grade.equalsIgnoreCase("GOLD")) {
            System.out.println(name+"님은 GOLD 회원입니다.");
            return (int)(price * 0.90);
        } else {
            System.out.println(name+"님은 회원이 아닙니다.");
            return price;
        }
    }

    // 1% 적립 포인트 추가하는 메서드
    // Basic : 1%, Silver: 2%, Gold: 3%
    public void earnPoints(int price) {
        if(grade.equalsIgnoreCase("BASIC")) {
            point += (int)(price * 0.01);
        } else if(grade.equalsIgnoreCase("SILVER")) {
            point += (int)(price * 0.02);
        } else if(grade.equalsIgnoreCase("GOLD")) {
            point += (int)(price * 0.03);
        } else {
            System.out.println(name+"님은 회원이 아닙니다.");
        }
    }

    // 고객 이름, 등급, 적립 포인트 출력 메서드
    public void showCustomerInfo() {
        System.out.printf("고객이름 : %s, 등급: %s, 포인트: %d%n",this.name,this.grade,this.point);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("개똥","GOLD", 0);
        customer.calculateDiscountPrice(23355);
        customer.showCustomerInfo();

    }
}
