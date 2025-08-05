package org.example.basic.bangjihyun.unitseventeen;

public class Calculator {

    public int calculate(String operator, int a,int b) {
     Operation operation = OperationFactory.getOperation(operator);
     return operation.apply(a,b);
    }
}
