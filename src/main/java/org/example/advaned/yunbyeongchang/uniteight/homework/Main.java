package org.example.advaned.yunbyeongchang.uniteight.homework;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationFactory slackFactory = new SlackNotificationFactory();

        emailFactory.process("메일 확인 부탁드립니다.");
        smsFactory.process("안녕하세요.");
        slackFactory.process("자료 첨부했습니다.");
    }
}
