package org.example.basic.yunbyeongchang.unitten.homework.box;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        Box<String> box = new Box<>();
        box.setItem("충전기");
        box.setDestination("누군가의 집");

        Box<Integer> boxCode = new Box<>();
        boxCode.setItem(122);
        boxCode.setDestination(1233122);

        System.out.println("박스 아이템: " + box.getItem() + ", 코드: " + boxCode.getItem());
        System.out.println("목적지: " + box.getDestination() + ", 코드: " + boxCode.getDestination());
    }

}
