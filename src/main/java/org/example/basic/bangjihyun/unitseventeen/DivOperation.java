package org.example.basic.bangjihyun.unitseventeen;

public class DivOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}
