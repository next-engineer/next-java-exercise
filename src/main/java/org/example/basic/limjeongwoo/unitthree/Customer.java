package org.example.basic.limjeongwoo.unitthree;

public class Customer {

    private String name;
    private String grade;
    private int point;

    public Customer (String name, String grade, int point){
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public int calculateDiscountPrice(int price){
        if ("GOLD".equals(grade)){
            price = (int)(price * 0.9);
        }else if("SILVER".equals(grade)){
            price = (int)(price * 0.95);
        }
        return price;
    }

    public void earnPoints(int price){
        int earned = (int)(price * 0.01);
        if ("GOLD".equals(grade)){
            earned += (int)(price * 0.02);
        }else if("SILVER".equals(grade)){
            earned += (int)(price * 0.01);
        }
        point += earned;
    }

    public void showCustomerInfo(){
        System.out.println("이름: " + name + " 등급: " + grade + " 포인트: " + point);
    }
}
