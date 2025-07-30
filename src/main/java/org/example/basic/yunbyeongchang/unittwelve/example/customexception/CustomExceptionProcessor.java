package org.example.basic.yunbyeongchang.unittwelve.example.customexception;

public class CustomExceptionProcessor {
    //var

    //method
    public static void main(String[] args)
    {

        try {
            checkAge(15);
        } catch(CustomException e) {
            System.out.println("사용자 정의 예외: " + e.getMessage());
        }

    }

    public static void checkAge(int age) throws CustomException {       // 사용자 정의 예외를 발생시키기 위해 throws
        if(age < 18)
            throw new CustomException("미성년자는 접근할 수 없습니다.");
    }

}
