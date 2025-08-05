package org.example.basic.parkminji.unitseventeen;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private final OperationRegistry registry;

    public Calculator() {
        this.registry = new OperationRegistry();
    }

    public int calculate(String operator, int a, int b) {
        OperatorType type;
        try {
            type = OperatorType.valueOf(operator.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("잘못된 연산자입니다: " + operator);
        }

        return registry.getOperation(type).apply(a, b);
    }
}