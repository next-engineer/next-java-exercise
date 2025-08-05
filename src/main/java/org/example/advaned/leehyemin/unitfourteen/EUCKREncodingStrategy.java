package org.example.advaned.leehyemin.unitfourteen;

import java.nio.charset.Charset;

public class EUCKREncodingStrategy implements EncodingStrategy {
    private static final Charset EUC_KR = Charset.forName("EUC-KR");

    @Override
    public String encode(String input) {
        byte[] bytes = input.getBytes(EUC_KR);
        return new String(bytes, EUC_KR);
    }

    @Override
    public String decode(String input) {
        return new String(input.getBytes(EUC_KR), EUC_KR);
    }
}
