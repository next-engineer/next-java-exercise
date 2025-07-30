package org.example.advaned.leejinwoo.unitNine;

public abstract class SendFactory {
    public void process(String msg, String type){
        Send send = createSend(type);
        send.send(msg);
    }

    protected abstract Send createSend(String type);
}
