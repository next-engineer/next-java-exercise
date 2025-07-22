package org.example.advaned.mindongil.unitfive;

//// 추상화 전
//public class EmailService {
//    public void sendEmail(String message) {
//        System.out.println("Sending email: " + message);
//    }
//}

    //추상화 후 구현
public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
