package org.example.basic.leehyemin.unitthree;

public class ShoppingPoint {
    public void earnPoints(int price, Member mall) {
        String grade=mall.getGrade();

        double rate=0.01;

        if(grade == "SIVER"){
            rate += 0.01;
        } else if(grade == "GOLD"){
            rate += 0.02;
        }

        int earnPoints = (int) (price * rate);
        mall.addPoint(earnPoints);

        System.out.println("적립 포인트 : "+mall.getPoint());
    }
}
