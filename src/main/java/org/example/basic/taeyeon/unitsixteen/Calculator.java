package org.example.basic.taeyeon.unitsixteen;

public class Calculator {

    // 이 함수는 연산자(operator)와 두 숫자(a, b)를 받아서 계산함.
    public int calculate(String operator, int a, int b) {
        if (operator.equals("add")) {
            return a + b;
        } else if (operator.equals("sub")) {
            return a - b;
        } else if (operator.equals("mul")) {
            return a * b;
        } else if (operator.equals("div")) {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없어요!");
                return 0;
            }
            return a / b;
        } else {
            System.out.println("잘못된 연산자예요!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.calculate("add", 7, 3)); // 7 + 3 = 10
        System.out.println(cal.calculate("sub", 7, 3)); // 7 - 3 = 4
        System.out.println(cal.calculate("mul", 7, 3)); // 7 * 3 = 21
        System.out.println(cal.calculate("div", 7, 0)); //
        System.out.println(cal.calculate("div", 7, 3)); // 7 / 3 = 2
           }
    }