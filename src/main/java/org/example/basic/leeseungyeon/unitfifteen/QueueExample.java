package org.example.basic.leeseungyeon.unitfifteen;

import java.util.*;

public class QueueExample {
    public void run() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Job1");
        queue.offer("Job2");

        System.out.println("Queue 출력:");
        while (!queue.isEmpty()) {
            System.out.println("처리 중: " + queue.poll());
        }
    }
}
