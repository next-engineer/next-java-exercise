package org.example.advaned.sangyoonlee.unittwo;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS 전송");
    }
}
