package org.example.advaned.kimyoungji.uniteight.notification;

public abstract class NotificationFactory {
    public void notifyUser(String to, String message) {
        Notification notification = createNotification();
        notification.send(to, message);
    }

    protected abstract Notification createNotification();
}
