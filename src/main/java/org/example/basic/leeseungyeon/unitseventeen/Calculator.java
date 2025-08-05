package org.example.basic.leeseungyeon.unitseventeen;

import java.util.HashMap;
import java.util.Map;


// Calculator Main Class 계산기 메인 클래스
public class Calculator {
    private final Map<String, Operation> operations;

    // Default constructor 기본 생성자
    public Calculator() {
        this.operations = new HashMap<>();
        initializeBasicOperations();
    }

    // Initialize basic operations 기본 연산들 초기화
    private void initializeBasicOperations() {
        operations.put("add", new AddOperation());
        operations.put("sub", new SubOperation());
        operations.put("mul", new MulOperation());
        operations.put("div", new DivOperation());
    }

    // Factory injection constructor 팩토리 주입 생성자
    public Calculator(OperationFactory factory) {
        this.operations = new HashMap<>();
        for (String op : factory.getSupportedOperators()) {
            this.operations.put(op, factory.getOperation(op));
        }
    }

    // Custom operations constructor 커스텀 연산 생성자
    public Calculator(Map<String, Operation> customOperations) {
        if (customOperations != null) {
            this.operations = new HashMap<>(customOperations);
        } else {
            this.operations = new HashMap<>();
            initializeBasicOperations();
        }
    }

    // Main calculate method 메인 계산 메서드
    public int calculate(String operator, int a, int b) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            try {
                operation = OperationFactory.getDefaultOperation(operator);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("지원하지 않는 연산입니다: " + operator);
            }
        }
        return operation.apply(a, b);
    }

    // Add operation at runtime 런타임 연산 추가
    public void addOperation(String operator, Operation operation) {
        operations.put(operator, operation);
    }

    // Remove operation 연산 제거
    public void removeOperation(String operator) {
        operations.remove(operator); // operations 필드가 제대로 정의되어야 해요
    }

    // Get supported operators 지원 연산자 목록
    public String[] getSupportedOperators() {
        return operations.keySet().toArray(new String[0]);
    }

    // Static quick calculate method 정적 빠른 계산 메서드
    public static int quickCalculate(String operator, int a, int b) {
        return OperationFactory.getDefaultOperation(operator).apply(a, b);
    }

    // Main method 메인 메서드
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("5 + 3 = " + calc.calculate("add", 5, 3));
        System.out.println("10 - 4 = " + calc.calculate("sub", 10, 4));
        System.out.println("6 * 7 = " + calc.calculate("mul", 6, 7));
        System.out.println("15 / 3 = " + calc.calculate("div", 15, 3));

        System.out.println("Static: " + Calculator.quickCalculate("add", 100, 200));

        // Test remove operation 연산 제거 테스트
        calc.removeOperation("div");
        System.out.println("Supported operations: " + String.join(", ", calc.getSupportedOperators()));
    }
}