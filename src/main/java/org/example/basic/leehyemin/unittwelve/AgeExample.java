package org.example.basic.leehyemin.unittwelve;

import java.util.Scanner;

public class AgeExample {
    public static void checkAge(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("미성년자는 접근할 수 없습니다.");
        }
        System.out.println("접근 허용 : 성인입니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("사용자 정의 예외 : "+e.getMessage());
        }
    }
}
