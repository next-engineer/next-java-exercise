package org.example.basic.kimaram.unitseventeen;

public class Div implements Operator {
    @Override
    public int calc(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}
