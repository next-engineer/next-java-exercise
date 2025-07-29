package org.example.basic.kimyoungji.unittwelve.exceptionexercise2;

public class StringToIntegerExample {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);
            System.out.println("변환된 숫자: " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없는 문자열입니다: " + input);
        }
    }
}