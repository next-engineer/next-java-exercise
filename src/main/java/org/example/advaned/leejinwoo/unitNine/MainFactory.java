package org.example.advaned.leejinwoo.unitNine;

public class MainFactory extends SendFactory{
    @Override
    protected Send createSend(String type) {
        Send send = null;

        if("Email".equalsIgnoreCase(type)){
            return send = new Email();
        }else if("SMS".equalsIgnoreCase(type)){
            return send = new SMS();
        }else if("Slack".equalsIgnoreCase(type)){
            return send = new Slack();
        }

        return send;
    }
}
