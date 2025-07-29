package org.example.advaned.sangyoonlee.uniteight;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory1 = new SMSNotificationFactory();
        factory1.process("마감일이");
        NotificationFactory factory2 = new EmailNotificationFactory();
        factory2.process("오늘까지입니다!");
        NotificationFactory factory3 = new SMSNotificationFactory();
        factory3.process("빨리 해주세요");
    }
}
