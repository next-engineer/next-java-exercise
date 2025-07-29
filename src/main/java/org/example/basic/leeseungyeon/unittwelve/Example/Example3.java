package org.example.basic.leeseungyeon.unittwelve.Example;

public class Example3 {
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

//실행 및 예외 처리 클래스
