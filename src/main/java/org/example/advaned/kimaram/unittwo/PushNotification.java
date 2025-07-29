package org.example.advaned.kimaram.unittwo;

public class PushNotification implements Notification{

    @Override
    public void send() {
        System.out.println("PUSH 전송 완료");
    }
}
