package main.java.org.example.advaned.anheebin.uniteight.Notification;

public class SlackNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}
