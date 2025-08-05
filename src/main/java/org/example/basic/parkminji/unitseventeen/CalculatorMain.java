package org.example.basic.parkminji.unitseventeen;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        runTest("add", 5, 3, 8);
        runTest("sub", 10, 4, 6);
        runTest("mul", 3, 7, 21);
        runTest("div", 20, 5, 4);
        runTest("div", 10, 0, null);  // 예외 테스트
        runTest("mod", 10, 3, null);  // 예외 테스트
    }

    private static void runTest(String operator, int a, int b, Integer expected) {
        Calculator calculator = new Calculator();
        try {
            int result = calculator.calculate(operator, a, b);
            printSuccessOrFail(operator, a, b, expected, result);
        } catch (Exception e) {
            printExceptionCase(operator, a, b, expected, e);
        }
    }

    private static void printSuccessOrFail(String operator, int a, int b, Integer expected, int result) {
        if (expected != null && result == expected) {
            System.out.printf("%s(%d, %d) = %d (예상: %d) [PASS]%n", operator, a, b, result, expected);
        } else {
            System.out.printf("%s(%d, %d) = %d (예상: %d) [FAIL]%n", operator, a, b, result, expected);
        }
    }

    private static void printExceptionCase(String operator, int a, int b, Integer expected, Exception e) {
        if (expected == null) {
            System.out.printf("%s(%d, %d) 예외 발생 예상대로: %s [PASS]%n", operator, a, b, e.getMessage());
        } else {
            System.out.printf("%s(%d, %d) 예외 발생 (예상 결과: %d): %s [FAIL]%n", operator, a, b, expected, e.getMessage());
        }
    }
}
