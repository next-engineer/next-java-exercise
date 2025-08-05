package org.example.basic.leeseungyeon.unitseventeen;

// Subtraction Operation 뺄셈 연산
public class SubOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        return a - b; // Perform subtraction a - b 뺄셈 수행
    }
}