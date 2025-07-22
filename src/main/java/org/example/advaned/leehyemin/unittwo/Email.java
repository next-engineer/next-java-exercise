package org.example.advaned.leehyemin.unittwo;

public class Email implements Notification {
    @Override
    public void send() {
        System.out.println("Email 전송 완료");
    }
}
