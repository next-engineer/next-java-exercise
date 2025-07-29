package org.example.basic.kimdonghyun.unitTwelve;
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CheckAge {
    public static void check(int age) throws AgeException {
        if (age < 19) {
            throw new AgeException("19세 미만은 허용되지 않습니다.");
        }
        System.out.println("접근 허용됨.");
    }

    public static void main(String[] args) {
        try {
            check(17);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
