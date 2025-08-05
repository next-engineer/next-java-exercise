package org.example.basic.taebinlee.unittwelve.Age;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이 입력: ");
        String input = scanner.nextLine();


        try {
            int age = Integer.parseInt(input);
            Age.checkage(age);
        } catch (NumberFormatException e)    {
            System.out.println("숫자를 입력해주세요.");

        } catch (ageException e) {
            System.out.println("접근불가 :" + e.getMessage());
        }

    }
}
