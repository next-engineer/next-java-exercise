package org.example.basic.kimyoungji.unittwelve.exceptionexercise1;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2; // 0으로 나눌 경우 예외 발생
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        scanner.close();
    }
}
