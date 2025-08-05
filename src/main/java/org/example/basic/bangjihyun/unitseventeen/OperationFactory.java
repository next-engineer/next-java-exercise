package org.example.basic.bangjihyun.unitseventeen;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("add", new AddOperation());
        operations.put("sub", new SubOperation());
        operations.put("mul", new MulOperation());
        operations.put("div", new DivOperation());
    }

    public static Operation getOperation(String operator) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("지원하지 않는 연산입니다: " + operator);
        }
        return operation;
    }
}
