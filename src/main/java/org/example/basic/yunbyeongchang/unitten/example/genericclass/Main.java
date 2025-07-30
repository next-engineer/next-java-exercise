package org.example.basic.yunbyeongchang.unitten.example.genericclass;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        Box<String> stringBox = new Box<>();
        stringBox.set("책이에용");
        String value = stringBox.get(); // 형변환이 필요 없다.

        System.out.println(value);
    }
}
