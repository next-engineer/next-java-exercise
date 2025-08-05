package org.example.basic.leehyemin.unitseventeen;

public class DivCal implements Operation {
    @Override
    public int apply(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}
