package org.example.basic.sangyoonlee.unitfifteen.chat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> messages = new ArrayList<>();

        messages.add(createMessage("매칭1", "안녕하세요~", "10:00"));
        messages.add(createMessage("매칭2", "넵! 안녕하세요", "10:01"));
        messages.add(createMessage("매칭1", "뭐하고 계셨어요?", "10:02"));
        messages.add(createMessage("매칭2", "뒹글거리고 있어요.", "10:03"));

        ChatDto chatDto = new ChatDto(messages);

        System.out.println("==== Next Chat ====");
        for (Map<String, String> msg : chatDto.chatMessages()) {
            System.out.printf("[%s] %s: %s\n", msg.get("time"), msg.get("sender"), msg.get("message"));
        }
    }

    private static Map<String, String> createMessage(String sender, String message, String time) {
        Map<String, String> msg = new HashMap<>();
        msg.put("sender", sender);
        msg.put("message", message);
        msg.put("time", time);
        return msg;
    }
}
