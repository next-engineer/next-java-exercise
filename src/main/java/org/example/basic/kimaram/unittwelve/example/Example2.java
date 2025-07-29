package org.example.basic.kimaram.unittwelve.example;

public class Example2 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null 객체 참조 에러: " + e);
        } catch (Exception e) {
            System.out.println("기타 예외: " + e);
        }
    }
}
