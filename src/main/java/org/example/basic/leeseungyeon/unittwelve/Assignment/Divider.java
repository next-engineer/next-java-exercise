package org.example.basic.leeseungyeon.unittwelve.Assignment;

public class Divider {
    public double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return (double) numerator / denominator;
    }
}

// 나누기 연산 클래스