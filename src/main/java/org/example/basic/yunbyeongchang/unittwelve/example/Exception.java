package org.example.basic.yunbyeongchang.unittwelve.example;

public class Exception {
    //var

    //method
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {       // 0으로 나눴을 경우 예외 처리
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

    }
}
