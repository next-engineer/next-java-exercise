package org.example.basic.leehyemin.unitthree.shopping;

//등급별 할인 가격 계산
public class ShoppingSale {
    public void calculateDiscountPrice(int price, Member member) {
        if(member.getGrade()=="BASIC"){
            System.out.println("할인 후 금액 : "+price);
        } else if(member.getGrade()=="SILVER"){
            price*=0.9;
            System.out.println("할인 후 금액 : "+price);
        } else if(member.getGrade()== "GOLD"){
            price*=0.95;
            System.out.println("할인 후 금액 : "+price);
        }
    }
}
