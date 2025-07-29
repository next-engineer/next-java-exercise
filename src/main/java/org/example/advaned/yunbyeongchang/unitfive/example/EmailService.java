package org.example.advaned.yunbyeongchang.unitfive.example;

class EmailService implements MessageService {
    //method
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
