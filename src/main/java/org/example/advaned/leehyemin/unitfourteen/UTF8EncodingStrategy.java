package org.example.advaned.leehyemin.unitfourteen;

import java.nio.charset.StandardCharsets;

public class UTF8EncodingStrategy implements EncodingStrategy {
    @Override
    public String encode(String input) {
        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @Override
    public String decode(String input) {
        return input;
    }
}
