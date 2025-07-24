package org.example.advaned.gojunho.uniteight.Notification;

public class Main {
    public static void main(String[] args){
        NotificationFactory email_no = new EmailFactory();
        email_no.process("이메일 테스트");
        NotificationFactory sms_no = new SMSFactory();
        sms_no.process("SMS 테스트");
        NotificationFactory slack_no = new SlackFactory();
        slack_no.process("SLACK 테스트");
        
    }
}
