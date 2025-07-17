package org.example.basic.leehyemin.unitthree;

public class ShoppingApp {
    public static void main(String[] args) {
        MemberPrint print = new MemberPrint();
        ShoppingPoint shoppingPoint = new ShoppingPoint();
        ShoppingSale shoppingSale = new ShoppingSale();

        Member member1=new Member("hyemin","GOLD",0);

        //print.showCustomerInfo(member1);

        //shoppingPoint.earnPoints(6000, member1);
        //System.out.println(member1.getName()+ member1.getPoint()+member1.getGrade());
        shoppingSale.calculateDiscountPrice(5000, member1);
    }
}
