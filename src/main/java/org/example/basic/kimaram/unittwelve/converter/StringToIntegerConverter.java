package org.example.basic.kimaram.unittwelve.converter;

// [실습 2. 문자열을 숫자로 변환]
// 설명   : 문자열을 Integer.parseInt()로 변환
// 목표   : NumberFormatException 처리하기
public class StringToIntegerConverter{
    public static void main(String[] args) {
        String text = "2334342qwrffqqfv23";
        try {
            int result = convert(text);
            System.out.println("변환된 숫자: " + result);
        } catch (NumberFormatException e) {
            System.out.println("예외 발생 : 문자열을 숫자로 바꿀 수 없습니다.");
        }
    }

    public static int convert(String text) {
        return Integer.parseInt(text);
    }
}
