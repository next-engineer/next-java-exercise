package org.example.basic.kimaram.unittwelve.age;

public class AgeMain {
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("예외 발생 : " +  e.getMessage());
        }

    }

    public static void checkAge(int age) throws AgeException {
        if(age < 19) {
            throw new AgeException("19세 미만은 접근할 수 없습니다.");
        }
    }
}
