package org.example.basic.yunbyeongchang.unitthree;

public class CustomerProcessor {
    public static void main(String[] args)
    {
        Customer man1 = new Customer("고객님", "BASIC", 0);
        Customer man2 = new Customer("고객님2", "SILVER", 0);
        Customer man3 = new Customer("고객님3", "GOLD", 0);

        System.out.println(man1.getName() + "이 계산하실 금액은 " + man1.calculateDiscountPrice(5000) + "원입니다.");
        System.out.println(man2.getName() + "이 계산하실 금액은 " + man2.calculateDiscountPrice(5000) + "원입니다.");


        man1.earnPoint(5000);
        man2.earnPoint(5000);
        man3.earnPoint(5000);
    }
}
