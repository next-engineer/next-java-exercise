package org.example.basic.taebinlee.unitfifteen;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> jobQueue = createJobQueue();
        processJobs(jobQueue);
    }

    private static Queue<String> createJobQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("job1");
        queue.offer("job2");
        return queue;

    }

    private static void processJobs(Queue<String> queue) {
        while ( !queue.isEmpty()) {
            System.out.println("처리중 :" + queue.poll());
        }
    }
}
