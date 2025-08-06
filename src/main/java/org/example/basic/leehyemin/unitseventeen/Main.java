package org.example.basic.leehyemin.unitseventeen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 연산을 입력하세요. ex) add, sub, mul, div");
        String op = sc.nextLine();

        System.out.println("연산하실 숫자 2개를 입력하세요. : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator cal = new Calculator();
        System.out.println("결과 : "+cal.caculate(op, a, b));
    }
}
