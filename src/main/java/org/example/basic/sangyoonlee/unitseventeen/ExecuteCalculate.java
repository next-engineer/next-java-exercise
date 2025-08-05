package org.example.basic.sangyoonlee.unitseventeen;

public class ExecuteCalculate {
    private static long add(long firstNumber, long secondNumber) {
        return firstNumber + secondNumber;
    }

    private static long sub(long firstNumber, long secondNumber) {
        return firstNumber - secondNumber;
    }

    private static long mul(long firstNumber, long secondNumber) {
        return firstNumber * secondNumber;
    }

    private static long div(long firstNumber, long secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return firstNumber / secondNumber;
    }

    private static long calculate(String calculateOrder, long firstNumber, long secondNumber) {
        return switch (calculateOrder) {
            case "add" -> add(firstNumber, secondNumber);
            case "sub" -> sub(firstNumber, secondNumber);
            case "mul" -> mul(firstNumber, secondNumber);
            case "div" -> div(firstNumber, secondNumber);
            default -> throw new IllegalArgumentException("지원하지 않는 연산입니다.");
        };
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculate("add", 100, 200));
            System.out.println(calculate("sub", 300, 500));
            System.out.println(calculate("mul", 400, 700));
            System.out.println(calculate("div", 100, 25));
            System.out.println(calculate("오류내기", 100, 25));
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
