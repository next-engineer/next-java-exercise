package org.example.basic.leehyemin.unitsix;

//Runnable Interface : 어떤 작업(로직)을 스레드로 실행시키고 싶을 때 사용
public class LambdaExample {
    public static void main(String[] args) {
        //기존 방식
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 실행");
            }
        };

        //Lambda 방식
        Runnable r2 = ()-> System.out.println("Thread 2 실행");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
