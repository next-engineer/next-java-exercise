package org.example.basic.yunbyeongchang.unitthree;

//[과제1]
//Java 객체 & 조건문 이해 실습 과제
//과제 개요
//이 과제에서는 객체 지향 프로그래밍(OOP)의 기본 개념과 조건문을 함께 연습합니다.
//학생들은 실제 객체를 설계하고, 객체의 속성과 메서드를 작성하며, 조건문을 통해 로직을 제어하는 코드를 작성하게 됩니다.
//과제 시나리오
//시나리오
//여러분은 온라인 쇼핑몰의 시스템을 개발하는 개발자입니다.
//쇼핑몰에는 여러 고객(Customer)이 있으며, 고객은 회원 등급에 따라 할인 혜택을 받습니다.
//회원 등급은 아래와 같습니다:
//BASIC: 할인 없음
//SILVER: 5% 할인
//GOLD: 10% 할인
//요구사항
//Customer 클래스 작성
//필드(속성):
//String name
//String grade
//int point
//메서드:
//int calculateDiscountPrice(int price):
//입력받은 상품 가격에서 회원 등급에 따라 할인된 가격을 반환합니다.
//void showCustomerInfo():
//        고객 이름, 등급, 적립 포인트를 출력합니다.
//        :둘: 조건문 사용
//calculateDiscountPrice 메서드 내부에서 if-else 조건문을 사용하여 등급에 따른 할인률을 계산합니다.
//추가 과제 (선택)
//earnPoints(int price) 메서드를 만들어서, 구매 금액의 1%를 적립 포인트로 추가하는 기능을 구현하세요.
//고객 등급에 따라 추가 포인트를 더 주도록 수정해 보세요.
//        예: GOLD는 추가 2% 포인트, SILVER는 추가 1% 포인트.

import java.util.Objects;

public class Customer {
    //var
    private String name;                                // 고객 이름
    private String grade;                               // 회원 등급
    private int point;                                  // 현재 포인트

    //method
    public Customer(String name, String grade, int point)                                   // 생성자
    {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }
    public int calculateDiscountPrice(int price)        // 입력받은 상품 가격에서 회원 등급에 따라 할인된 가격을 반환
    {
        int sum;

        if(Objects.equals(this.grade, "BASIC"))  return price;      // 할인 없음
        else if(Objects.equals(this.grade, "SILVER"))               // 5%
        {
            sum = price / 20;
            return price - sum;
        }
        else if(Objects.equals(this.grade, "GOLD"))                 // 10%
        {
            sum = price / 10;
            return price - sum;
        }
        else                                                            // 오류
        {
            System.out.println("잘못된 입력입니다."); return -1;
        }

//        switch(this.grade)
//        {
//            case "BASIC":                               // 할인 없음
//                return price;
//            case "SILVER":                              // 5% 할인
//                sum = price / 20;
//                return price - sum;
//            case "GOLD":                                // 10% 할인
//                sum = price / 10;
//                return price - sum;
//            default:
//                return -1;
//        }
    }

    public void showCustomerInfo()                      // 소비자 정보 출력
    {
        System.out.println("--------------------------");
        System.out.println("이름: " + this.name);
        System.out.println("등급: " + this.grade);
        System.out.println("포인트: " + this.point);
        System.out.println("--------------------------");
    }

    public void earnPoint(int price)                    // 구매 금액의 1%를 적립 포인트로 추가
    {
        int sum = 0;
        switch(this.grade)
        {
            case "BASIC":                               // 0%
                System.out.println(this.grade + "등급은 포인트가 쌓이지 않습니다.");
                break;
            case "SILVER":                              // 1%
                sum = price / 100;
                this.point += sum;
                System.out.println(sum + "만큼의 포인트가 적립되었습니다.");
                break;
            case "GOLD":                                // 2%
                sum = price / 50;
                this.point += sum;
                System.out.println(sum + "만큼의 포인트가 적립되었습니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    //getter setter
    public String getName()
    {
        return this.name;
    }
    public String getGrade()
    {
        return this.grade;
    }
    public int getPoint()
    {
        return this.point;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }
}
