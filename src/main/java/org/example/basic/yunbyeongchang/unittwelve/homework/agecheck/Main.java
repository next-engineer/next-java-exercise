package org.example.basic.yunbyeongchang.unittwelve.homework.agecheck;

public class Main {
    //var

    //method
    public static void main(String[] args) {
        int age = 10;

        try {
            CheckAge.checkAge(age);
        } catch(AgeException e) {
            System.out.println("사용자 정의 예외: " + e.getMessage());
        }
    }
}
