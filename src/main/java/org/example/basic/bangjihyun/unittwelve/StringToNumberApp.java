package org.example.basic.bangjihyun.unittwelve;

import java.util.Scanner;
// 문자열 숫자 변환
public class StringToNumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자로 변환할 문자열을 입력하세요: ");
        String input = scanner.nextLine();

        try {
            int number= parseStringToInt(input);
            System.out.println("변환된 숫자: " + number);
        } catch (NumberFormatException e) {
            System.out.println("예외 발생: 숫자로 변환할 수 없습니다.");
        }

        scanner.close();
    }

    private static int parseStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
