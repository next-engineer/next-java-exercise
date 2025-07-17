package org.example.advaned.sangyoonlee.unittwo;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("이메일 전송");
    }
}
