package org.example.basic.parkgwanghoon.UnitTwelve;

import java.util.Scanner;

public class DividingExceptionExample {
    public void zeroDivide() {
        Scanner s = new Scanner(System.in);
        int s1;
        int s2;
        System.out.println("첫번째 숫자를 입력하세요:");
        s1 = s.nextInt();
        System.out.println("두번째 숫자를 입력하세요:");
        s2 = s.nextInt();
        try {
            int result = s1 / s2;
            System.out.println(s1 + "을(를) " + s2 + "로 나누면 " + result + "입니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
    public static void main(String[] args) {
        DividingExceptionExample example = new DividingExceptionExample();
        example.zeroDivide();
    }
}



