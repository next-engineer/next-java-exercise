package org.example.basic.leeseungyeon.unitseventeen;

// Addition Operation 덧셈 연산
public class AddOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        return a + b; // Perform addition a + b 덧셈 수행
    }
}