package org.example.basic.yunbyeongchang.unitsix.lambda;
import java.util.function.BiFunction;

public class LambdaExample1 {
    public static void main(String[] args) {

        // Runnable: 1개의 메소드(abstract void run())만을 가진 인터페이스

        // 기존 방식(5 line)
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread 1 실행");
            }
        };

        // Lambda 방식(1 line)
        Runnable r2 = () -> System.out.println("Thread 2 실행");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
