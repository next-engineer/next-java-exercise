package org.example.advaned.sangyoonlee.uniteight;

public class SlackNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SlackNotification();
    }
}
