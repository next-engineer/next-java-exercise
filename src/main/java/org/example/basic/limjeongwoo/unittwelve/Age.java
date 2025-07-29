package org.example.basic.limjeongwoo.unittwelve;

public class Age {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }finally {
            System.out.println("프로그램 종료");
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("19세 미만은 접근할 수 없습니다.");
        }
    }
}
