package org.example.basic.taebinlee.unittwelve.divide;

import java.util.Scanner;

public class DivideNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("첫번째 숫자 입력 : ");
            int a = scanner.nextInt();
            System.out.println("두번째 숫자 입력 : ");
            int b = scanner.nextInt();

            int result = (a/b);
            System.out.println("결과 : "+ result);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");

        } finally {
            scanner.close();
        }
    }
}
