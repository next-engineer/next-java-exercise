package org.example.basic.parkgwanghoon.UnitTwelve;

public class NumFormatExceptionExample {

    public static void main(String[] args) {
        String str = "12";
        try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("입력 오류");
            e.printStackTrace();
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
