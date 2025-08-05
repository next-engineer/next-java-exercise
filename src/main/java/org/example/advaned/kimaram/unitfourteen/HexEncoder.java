package org.example.advaned.kimaram.unitfourteen;

import java.nio.charset.StandardCharsets;

public class HexEncoder implements TextStrategy{
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    @Override
    public String textEncoding(String text) {
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
