package main.java.org.example.basic.ANheebin.unittwelve;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("숫자로 변환할 문자열을 입력하세요");
            String input = sc.nextLine();

            try{
                int number = Integer.parseInt(input);
                System.out.println("변환된 숫자: " + number);
            }catch(NumberFormatException e){
                System.out.println("숫자로 변환할 수 없습니다.");
            }finally{}
        }
    }
}
