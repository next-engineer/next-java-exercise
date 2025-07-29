<<<<<<< HEAD:src/main/java/org/example/basic/ANheebin/unitsix/LambdaExample1.java
package org.example.basic.ANheebin.onepROJECT.unitsix;
=======
package org.example.basic.leeseungyeon.unitsix;
>>>>>>> fc078c1a9a60aeb6103d98986f332d29b32088d6:src/main/java/org/example/basic/leeseungyeon/unitsix/LambdaExample1.java

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
