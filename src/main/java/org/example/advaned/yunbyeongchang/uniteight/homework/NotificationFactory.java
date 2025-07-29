package org.example.advaned.yunbyeongchang.uniteight.homework;

public abstract class NotificationFactory {
    //var

    //method
    public void process(String message)
    {
        Notification notification = createNotification();
        notification.notification(message);
    }

    protected abstract Notification createNotification();
}
