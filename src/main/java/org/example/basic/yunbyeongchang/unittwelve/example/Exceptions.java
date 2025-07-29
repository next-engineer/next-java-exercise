package org.example.basic.yunbyeongchang.unittwelve.example;

import java.lang.Exception;

public class Exceptions {
    //var

    //method
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {                  // Null 예외 처리
            System.out.println("Null 객체 참조 에러");
        } catch (Exception e) {                             // 기타 예외 처리
            System.out.println("기타 에러: " + e.getMessage());
        }

    }
}
