package org.example.advaned.anheebin.uniteight.Notification;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.sendMessage(message);
    }
}
