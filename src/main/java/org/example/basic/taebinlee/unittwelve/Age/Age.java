package org.example.basic.taebinlee.unittwelve.Age;

public class Age {

    public static void checkage(int age) throws ageException {
        if (age < 19) {
            throw new ageException("19세 미만은 사용할 수 없습니다");
        }

        System.out.println("나이 : "+ age);

    }
}
