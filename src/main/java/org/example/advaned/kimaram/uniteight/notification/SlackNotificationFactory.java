package org.example.advaned.kimaram.uniteight.notification;

public class SlackNotificationFactory extends NotificationFactory{
    @Override
    protected Notification createNotification() {
        return new SlackNotification();
    }
}
