package org.example.advaned.kimaram.unittwo;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("이메일 전송 완료");
    }
}
