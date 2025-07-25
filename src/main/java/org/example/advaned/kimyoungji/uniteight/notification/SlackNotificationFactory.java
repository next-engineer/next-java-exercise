package org.example.advaned.kimyoungji.uniteight.notification;

public class SlackNotificationFactory extends NotificationFactory {
    protected Notification createNotification() {
        return new SlackNotification();
    }
}