package org.example.advaned.mindongil.unitfive;

public class Notification {

//    //추상화 전
//    private EmailService emailService = new EmailService(); // 구체 클래스에 의존
//
//    public void alert(String msg) {
//        emailService.sendEmail(msg);
//    }

    //추상화 후
    private final MessageService service;

    public Notification(MessageService service) {
        this.service = service;
    }

    public void alert(String msg) {
        service.sendMessage(msg);
    }

}
