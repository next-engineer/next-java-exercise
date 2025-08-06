package org.example.basic.leehyemin.unitseventeen;

import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations = Map.of(
            "add", new AddCal(),
            "sub", new SubCal(),
            "mul", new MulCal(),
            "div", new DivCal()
    );

    public int caculate(String operator, int a, int b) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("지원하지 않는 연산입니다: " + operator);
        }

        return operation.apply(a, b);
    }
}
