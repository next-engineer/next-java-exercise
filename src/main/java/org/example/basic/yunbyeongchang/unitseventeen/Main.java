package org.example.basic.yunbyeongchang.unitseventeen;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator(new Add());
        System.out.println(cal.calculate(5, 3)); // 8
    }
}
