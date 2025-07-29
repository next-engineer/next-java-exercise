package main.java.org.example.advaned.anheebin.uniteight.Notification;

public class EmailNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email로 메시지 전송: " + message);
    }
    
}
