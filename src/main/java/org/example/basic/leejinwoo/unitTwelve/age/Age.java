package org.example.basic.leejinwoo.unitTwelve.age;

import org.example.basic.leejinwoo.unitTwelve.MyException;

public class Age {
    public static void main(String[] args) throws MyException {
        int age = 10;

        printInfo(age);
    }

    public static void printInfo(int age) throws MyException {
        if(age < 19){
            throw new MyException("19세 미만은 예외 발생");
        }

        System.out.println("age : " + age);
    }
}
