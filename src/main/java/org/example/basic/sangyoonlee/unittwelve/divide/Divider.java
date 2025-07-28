package org.example.basic.sangyoonlee.unittwelve.divide;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Divider {

    private static String divide(BigDecimal frontNumber, BigDecimal backNumber) {
        try {
            return "결과: " + frontNumber.divide(backNumber, 17, RoundingMode.HALF_DOWN)
                    .stripTrailingZeros().toPlainString();
        } catch (ArithmeticException ae) {
            return "오류: 0으로 나눌 수 없습니다.";
        }
    }

    private static void ScannerUtil(Scanner scanner) {
        try {
            System.out.println("나눌 숫자를 입력하세요.");
            String frontNumber = scanner.nextLine();

            System.out.println("나누는 숫자를 입력하세요.");
            String backNumber = scanner.nextLine();

            BigDecimal front = new BigDecimal(frontNumber);
            BigDecimal back = new BigDecimal(backNumber);

            System.out.println(divide(front, back));
        } catch (NumberFormatException nfe) {
            System.out.println("오류: 숫자 형식이 올바르지 않습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerUtil(scanner);
    }
}
