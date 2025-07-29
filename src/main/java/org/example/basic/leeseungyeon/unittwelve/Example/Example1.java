package org.example.basic.leeseungyeon.unittwelve.Example;

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

//기본 예외 처리