package org.example.basic.sangyoonlee.unittwelve.age;

public class AgeChecker {

    public static void checkAge(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("19세 미만은 사용할 수 없습니다. 입력한 나이: " + age);
        }

        System.out.println("접근 허용: 나이 " + age);
    }
}
