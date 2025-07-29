package org.example.basic.kimdonghyun.unitTwelve;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("첫 번째 숫자 입력: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자 입력: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            scanner.close();
        }
    }
}
