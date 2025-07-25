package org.example.advaned.leehyemin.uniteight.notification;

public class SlackNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SlackNotify();
    }
}
