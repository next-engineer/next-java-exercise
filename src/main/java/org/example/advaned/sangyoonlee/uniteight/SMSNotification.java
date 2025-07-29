package org.example.advaned.sangyoonlee.uniteight;

public class SMSNotification implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("SMS 알림");
        System.out.println(message);
    }
}
