package org.example.basic.bangjihyun.unittwelve;

import java.util.Scanner;
// 숫자 나누기 예외 처리
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = readInt(scanner, "첫 번째 정수를 입력하세요: ");
        int denominator = readInt(scanner, "두 번째 정수를 입력하세요: ");

        try {
            int result = divide(numerator, denominator);
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        }

        scanner.close();
    }

    // 입력 처리 readInt() 함수로 분리
    private static int readInt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // divide() 함수로 로직 분리
    private static int divide(int a, int b) {
        return a / b;
    }
}