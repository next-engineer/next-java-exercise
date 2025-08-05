package org.example.basic.leeseungyeon.unitseventeen;

// Division Operation 나눗셈 연산
public class DivOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        if (b == 0) {
            // Handle division by zero 0으로 나누기 예외 처리
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b; // Perform division a / b 나눗셈 수행
    }
}
