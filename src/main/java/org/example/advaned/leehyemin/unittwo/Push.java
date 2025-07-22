package org.example.advaned.leehyemin.unittwo;

public class Push implements Notification {
    @Override
    public void send() {
        System.out.println("Push 알림 전송 완료");
    }
}
