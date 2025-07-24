package org.example.advaned.leehyemin.uniteight.notification;

public abstract class NotificationFactory {
    public void notify(String alarm) {
        Notification note = createNotification();
        note.notify(alarm);
    }

    protected abstract Notification createNotification();
}
