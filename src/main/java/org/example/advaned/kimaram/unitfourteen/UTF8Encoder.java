package org.example.advaned.kimaram.unitfourteen;

import java.nio.charset.StandardCharsets;

public class UTF8Encoder implements TextStrategy{
    @Override
    public String textEncoding(String text) {
        byte[] utf8Bytes = text.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Bytes, StandardCharsets.ISO_8859_1);
    }
}
