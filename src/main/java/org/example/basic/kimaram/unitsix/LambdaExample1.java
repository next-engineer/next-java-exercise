package org.example.basic.kimaram.unitsix;

// 1. Runnable - 쓰레드 실행 간단화
public class LambdaExample1 {
    public static void main(String[] args) {
        // 기존 방식
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread 1 실행");
            }
        };

        // Lambda 방식
        Runnable r2 = () -> System.out.println("Thread 2 실행");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
