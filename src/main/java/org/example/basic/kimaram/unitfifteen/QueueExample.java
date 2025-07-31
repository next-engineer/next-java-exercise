package org.example.basic.kimaram.unitfifteen;

import java.util.LinkedList;
import java.util.Queue;

// Queue : 한쪽에서 삽입(offer), 다른 쪽에서 삭제(poll)
// LinkedList : 순서대로 데이터를 저장하며, FIFO 구조로 작동
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("job1");
        queue.offer("job2");

        while (!queue.isEmpty()) {
            System.out.println("처리 중: " + queue.poll());
        }
    }
}
