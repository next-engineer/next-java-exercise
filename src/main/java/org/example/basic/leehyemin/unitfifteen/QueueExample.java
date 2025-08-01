package org.example.basic.leehyemin.unitfifteen;

import java.util.LinkedList;
import java.util.Queue;

//offer : 삽입, poll : 삭제
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Job1");
        queue.offer("Job2");

        while (!queue.isEmpty()){
            System.out.println("처리 중 : "+queue.poll());
        }
    }
}
