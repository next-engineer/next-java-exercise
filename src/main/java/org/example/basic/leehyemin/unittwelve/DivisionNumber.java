package org.example.basic.leehyemin.unittwelve;

import java.util.Scanner;

public class DivisionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 2개를 입력하시오.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println(num1+" ÷ "+num2+" = "+ result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
        
    }
}
