package org.example.advaned.kimaram.unitfourteen;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Encoder implements TextStrategy{
    @Override
    public String textEncoding(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }
}
