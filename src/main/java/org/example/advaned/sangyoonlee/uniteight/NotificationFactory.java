package org.example.advaned.sangyoonlee.uniteight;

public abstract class NotificationFactory {
    public void process(String message) {
        Notification notification = createNotification();
        notification.notify(message);
    }

    protected abstract Notification createNotification();
}
