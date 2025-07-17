package org.example.advaned.leehyemin.unittwo;

public class SMS implements Notification {
    @Override
    public void send() {
        System.out.println("SMS 전송 완료");
    }
}
