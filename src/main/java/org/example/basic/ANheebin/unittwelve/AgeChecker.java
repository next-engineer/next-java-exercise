package org.example.basic.ANheebin.unittwelve;

import java.util.Scanner;

public class AgeChecker {

    
    public static void checkAge(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("❌ 나이는 19세 이상이어야 합니다. 입력한 나이: " + age);
        } else {
            System.out.println("✅ 성인입니다. 나이: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        
        try {
            int age = scanner.nextInt();
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("입력 오류: 숫자를 입력해야 합니다.");
        } finally {
            scanner.close();
        }
    }
}

