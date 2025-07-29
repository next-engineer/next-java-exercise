package org.example.basic.gojunho.unitsix;

public class LambdfExample1 {
    public static void main(String args[]){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 실행");
            }
        };

        Runnable r2=()-> System.out.println("Thread 2 실행");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
