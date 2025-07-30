package main.java.org.example.advaned.anheebin.uniteight.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
