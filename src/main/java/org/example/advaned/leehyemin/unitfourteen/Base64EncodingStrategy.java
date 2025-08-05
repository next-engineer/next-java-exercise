package org.example.advaned.leehyemin.unitfourteen;

import java.util.Base64;

public class Base64EncodingStrategy implements EncodingStrategy {
    @Override
    public String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    @Override
    public String decode(String input) {
        return new String(Base64.getDecoder().decode(input));
    }
}
