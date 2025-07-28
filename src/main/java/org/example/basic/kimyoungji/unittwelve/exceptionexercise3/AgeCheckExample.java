package org.example.basic.kimyoungji.unittwelve.exceptionexercise3;

public class AgeCheckExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("사용자 정의 예외: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("19세 미만은 접근할 수 없습니다.");
        }
        System.out.println("접근 가능 나이: " + age);
    }
}