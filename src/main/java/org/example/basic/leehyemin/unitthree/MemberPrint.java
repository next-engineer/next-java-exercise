package org.example.basic.leehyemin.unitthree;

public class MemberPrint {
    public void showCustomerInfo(Member member) {
        System.out.println("이름 : "+member.getName());
        System.out.println("등급 : "+member.getGrade());
        System.out.println("적립 포인트 : "+member.getPoint());
    }
}
