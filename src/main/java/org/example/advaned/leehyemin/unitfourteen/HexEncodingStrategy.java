package org.example.advaned.leehyemin.unitfourteen;

public class HexEncodingStrategy implements EncodingStrategy {
    @Override
    public String encode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : input.getBytes()) {
            stringBuilder.append(String.format("%02X", b));
        }
        return stringBuilder.toString();
    }

    @Override
    public String decode(String input) {
        int len = input.length();
        byte[] data = new byte[len/2];
        for(int i = 0; i < len; i+=2) {
            data[i / 2] = (byte) ((Character.digit(input.charAt(i), 16) << 4)
                    + Character.digit(input.charAt(i+1), 16));
        }
        return new String(data);
    }
}
