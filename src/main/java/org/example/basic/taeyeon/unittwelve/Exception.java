package org.example.basic.taeyeon.unittwelve;

public class Exception extends Throwable {
    public Exception(String message) {

    }

    public class Example1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}

}
class Example2 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null 객체 참조 에러");
        }
    }
}
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Example3 {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyException e) {
            System.out.println("사용자 정의 예외: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("미성년자는 접근할 수 없습니다.");
        }
    }
}
