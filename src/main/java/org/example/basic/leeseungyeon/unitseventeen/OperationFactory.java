package org.example.basic.leeseungyeon.unitseventeen;

import java.util.HashMap;
import java.util.Map;

// Operation Factory Class 연산 팩토리 클래스
public class OperationFactory {
    private final Map<String, Operation> operations;
    private static final OperationFactory DEFAULT_INSTANCE = new OperationFactory();

    // Default constructor 기본 생성자
    public OperationFactory() {
        this.operations = new HashMap<>();
        initializeOperations();
    }

    // Initialize basic operations 기본 연산들 초기화
    private void initializeOperations() {
        operations.put("add", new AddOperation());
        operations.put("sub", new SubOperation());
        operations.put("mul", new MulOperation());
        operations.put("div", new DivOperation());
    }

    // Get operation instance method 연산 객체 반환 (인스턴스 메서드)
    public Operation getOperation(String operator) {
        Operation op = operations.get(operator);
        if (op == null) {
            throw new IllegalArgumentException("지원하지 않는 연산입니다: " + operator);
        }
        return op;
    }

    // Register new operation 새로운 연산 등록
    public void registerOperation(String operator, Operation operation) {
        operations.put(operator, operation);
    }

    // Get supported operators 지원하는 연산자 목록 반환
    public String[] getSupportedOperators() {
        return operations.keySet().toArray(new String[0]);
    }

    // Static methods 정적 메서드들
    public static OperationFactory getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    // Static method with different name 다른 이름의 정적 메서드
    public static Operation getDefaultOperation(String operator) {
        return DEFAULT_INSTANCE.getOperation(operator);
    }
}