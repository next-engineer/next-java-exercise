package org.example.advaned.sangyoonlee.uniteight;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
