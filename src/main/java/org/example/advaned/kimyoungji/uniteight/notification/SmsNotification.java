package org.example.advaned.kimyoungji.uniteight.notification;

public class SmsNotification implements Notification {
    public void send(String to, String message) {
        System.out.println("SMS to " + to + ": " + message);
    }
}
