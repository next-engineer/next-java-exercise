package org.example.basic.ANheebin.onepROJECT.unitsix;

public class LambdaExample1 {
    public static void main(String[] args) {

        Runnable r1=new Runnable() {
            public void run() {
                System.out.println("Thread 1 실행");
            }
        };

        Runnable r2 = () -> System.out.println("Thread 2 실행");

        r1.run();
        r2.run();
    }
}
