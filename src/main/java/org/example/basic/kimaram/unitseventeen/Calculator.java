package org.example.basic.kimaram.unitseventeen;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    // 연산자 이름을 key로, 해당 연산자 객체를 value로 저장
    private static final Map<String, Operator> operators = new HashMap<>();

    static {
        operators.put("add", new Add());
        operators.put("sub", new Sub());
        operators.put("mul", new Mul());
        operators.put("div", new Div());
    }

    public int calculate(String operatorName, int a, int b) {
        Operator operator = operators.get(operatorName);
        if (operator == null) {
            throw new IllegalArgumentException("지원하지 않는 연산입니다.");
        }
        return operator.calc(a, b);
    }
}
