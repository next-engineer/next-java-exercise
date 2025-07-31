package org.example.basic.yunbyeongchang.unitfifteen;

import java.util.*;

public class QueueExample {
    //var

    //method
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Job1");
        queue.offer("Job2");

        while(!queue.isEmpty()) {
            System.out.println("처리 중: " + queue.poll());
        }

    }
}

//한 방향으로 삽입(offer), 삭제(poll)
//작업 대기열 등에서 사용
//linked-list -> (ㅁ <-> ㅁ <-> ㅁ) 구조