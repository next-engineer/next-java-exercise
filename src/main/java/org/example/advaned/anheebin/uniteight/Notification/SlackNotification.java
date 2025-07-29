package main.java.org.example.advaned.anheebin.uniteight.Notification;

public class SlackNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Slack으로 메시지 전송: " + message);
    }
}
