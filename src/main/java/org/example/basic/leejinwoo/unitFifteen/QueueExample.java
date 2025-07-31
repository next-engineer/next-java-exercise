package org.example.basic.leejinwoo.unitFifteen;

import java.util.LinkedList;
import java.util.Queue;

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
