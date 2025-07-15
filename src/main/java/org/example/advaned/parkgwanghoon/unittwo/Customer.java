package org.example.advaned.parkgwanghoon.unittwo;

public class Customer {
    private String name;
    private String grade;
    private int point;

    //생성자
    public Customer(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.point = 0;
    }
    //할인 메서드
    public int calculateDiscountPrice(int price) {
        double discount = 0.0;

         if (grade.equals("BASIC")) {
             discount = 0.0;
         } else if (grade.equals("SILVER")) {
             discount = 0.05;
         } else if(grade.equals("GOLD")) {
             discount = 0.1;
         }
         return price - (int)(price * discount);
    }
    //포인트 적립 메서드
    public int earnPoints(int price) {
        double earnRate = 0.0;

        if (grade.equals("BASIC")) {
            earnRate = 0.01;
        } else if (grade.equals("SILVER")) {
            earnRate = 0.02;
        } else if (grade.equals("GOLD")) {
            earnRate = 0.03;
        }

        int earned = (int)(price * earnRate);
        point += earned;
        System.out.println("적립 포인트: " + earned + "점\n");
        return earned;
    }
    //고객 정보 출력
    public void showCustomerInfo() {
        System.out.println("고객 성함: " + name + " 고객님");
        System.out.println("고객 등급: " + grade);
        System.out.println("누적 포인트: " + point + "점");
    }

}
