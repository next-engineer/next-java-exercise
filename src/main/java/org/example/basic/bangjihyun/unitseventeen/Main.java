package org.example.basic.bangjihyun.unitseventeen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원하시는 연산을 입력하세요. (add, sub, mul, div)");
        String op = sc.nextLine();

        System.out.println("연산할 숫자 2개를 입력하세요.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);

        System.out.println("결과: " + result);
    }
}
