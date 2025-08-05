package org.example.basic.yunbyeongchang.unitseventeen;

public class Calculator {
    //var
    private Operation operation;

    //method
    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b) {
        if(this.operation == null) {
            throw new IllegalArgumentException("지원하지 않는 연산입니다.");
        }

        return operation.operation(a,b);
    }
}

