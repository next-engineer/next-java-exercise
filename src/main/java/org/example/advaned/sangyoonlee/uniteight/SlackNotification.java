package org.example.advaned.sangyoonlee.uniteight;

public class SlackNotification implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("slack 알림");
        System.out.println(message);
    }
}
