package org.example.basic.yunbyeongchang.unittwelve.homework.parseint;

public class ParseInt {
    //var

    //method
    public static void parseInt(String str) {
        try {
            System.out.println("Parse Result: " + Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없는 문자열입니다.");
        } finally {
            System.out.println("변환을 종료합니다.");
        }
    }

}
