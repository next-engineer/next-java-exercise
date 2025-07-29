package org.example.basic.leehyemin.unittwelve;

public class Example3 {
    public static void main(String[] args) {
        try {
            checkAge(19);
        } catch (MyException e) {
            System.out.println("사용자 정의 예외 : "+ e.getMessage());
        }
    }

    public static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("미성년자는 접근할 수 없습니다.");
        } else {
            System.out.println("접근 가능");
        }
    }
}
