package org.example.advaned.leehyemin.uniteight.notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotify();
    }
}
