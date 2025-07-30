package org.example.advaned.kimyoungji.uniteight.notification;

public class EmailNotification implements Notification {
    public void send(String to, String message) {
        System.out.println("Email to " + to + ": " + message);
    }
}
