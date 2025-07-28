package org.example.basic.sangyoonlee.unittwelve.age;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = scanner.nextLine();

        try {
            int age = Integer.parseInt(input);
            AgeChecker.checkAge(age);
        } catch (NumberFormatException e) {
            System.out.println("오류: 숫자로 입력해주세요.");
        } catch (AgeException e) {
            System.out.println("접근 불가: " + e.getMessage());
        }
    }
}
