package org.example.advaned.kimyoungji.uniteight.notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
