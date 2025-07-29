package org.example.advaned.kimyoungji.uniteight.notification;

public class SlackNotification implements Notification {
    public void send(String to, String message) {
        System.out.println("Slack to " + to + ": " + message);
    }
}
