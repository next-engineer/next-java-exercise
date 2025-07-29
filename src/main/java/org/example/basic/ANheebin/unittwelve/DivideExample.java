package org.example.basic.ANheebin.unittwelve;

import java.util.Scanner;

public class DivideExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번쨰 숫자를 입력하세요");
        int num1 =sc.nextInt();
        System.out.println("두두번쨰 숫자를 입력하세요");
        int num2 =sc.nextInt();

        try{
            int result = num1 / num2;
            System.out.println("결과: " + result);
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }finally{
            sc.close();
        }

        sc.close();
    }

    
}
