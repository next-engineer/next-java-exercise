package org.example.advaned.yunbyeongchang.unitfive.example;

// 고수준 모듈은 추상화에 의존
class Notification {

    //var
    private final MessageService service;

    //method
    public Notification(MessageService service) {
        this.service = service;
    }

    public void alert(String msg) {
        service.sendMessage(msg);
    }
}
