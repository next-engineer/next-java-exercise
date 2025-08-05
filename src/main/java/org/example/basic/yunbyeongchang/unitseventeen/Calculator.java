package org.example.basic.yunbyeongchang.unitseventeen;

public class Calculator {

    public int calculate(String operator, int a, int b) {
        if (operator.equals("add")) {
            return a + b;
        } else if (operator.equals("sub")) {
            return a - b;
        } else if (operator.equals("mul")) {
            return a * b;
        } else if (operator.equals("div")) {
            if (b == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("지원하지 않는 연산입니다.");
        }
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.calculate("add", 5, 3)); // 8
    }
}

