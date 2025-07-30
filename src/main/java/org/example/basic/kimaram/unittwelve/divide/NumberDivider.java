package org.example.basic.kimaram.unittwelve.divide;

import java.util.InputMismatchException;
import java.util.Scanner;

// [실습 1. 숫자 나누기 프로그램]
// 설명  : 사용자로부터 숫자 두 개를 입력받아 나누기 수행
// 목표  : 0 으로 나눌 경우 예외 처리 , Scanner 사용, try-catch로 0 나누기 예외 처리하기
public class NumberDivider {
    public static void main(String[] args) {
        // try-with-resources 사용
        try (Scanner scanner = new Scanner(System.in);){
            System.out.println("첫 번째 숫자를 입력해주세요.");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력해주세요.");
            int num2 = scanner.nextInt();

            double result = divide(num1, num2);
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("예외 발생: 숫자를 입력해야 합니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    // 나눗셈 메서드
    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return (double) num1 / num2;
    }
}
