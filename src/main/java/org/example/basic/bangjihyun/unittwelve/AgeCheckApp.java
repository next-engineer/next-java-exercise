package org.example.basic.bangjihyun.unittwelve;
// 사용자 정의 예외
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeCheckApp {

    public static void main(String[] args) {
        int age = 17;

        try {
            validateAge(age);
            System.out.println("접근 허용");
        } catch (AgeException e) {
            System.out.println("접근 거부: " + e.getMessage());
        }
    }

    private static void validateAge(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("19세 미만은 접근할 수 없습니다.");
        }
    }
}
