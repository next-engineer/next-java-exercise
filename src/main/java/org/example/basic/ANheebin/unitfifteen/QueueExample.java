package org.example.basic.ANheebin.unitfifteen;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Job1");
        queue.offer("Job2");

        while (!queue.isEmpty()) {
            System.out.println("처리 중: " + queue.poll());
        }
    }
}
