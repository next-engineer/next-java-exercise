package org.example.basic.parkgwanghoon.UnitSeventeen;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculator {

    private final Map<String, BinaryOperator<Integer>> operations = new HashMap<>();

    public Calculator() {
        operations.put("add", (a, b) -> a + b);
        operations.put("sub", (a, b) -> a - b);
        operations.put("mul", (a, b) -> a * b);
        operations.put("div", (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        });
    }

    public int calculate(String operator, int a, int b) {
        BinaryOperator<Integer> op = operations.get(operator);
        if (op == null) {
            throw new IllegalArgumentException("지원하지 않는 연산입니다.");
        }
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.calculate("add", 5, 3)); // 8
    }
}

