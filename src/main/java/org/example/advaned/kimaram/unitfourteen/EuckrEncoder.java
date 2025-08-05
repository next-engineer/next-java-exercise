package org.example.advaned.kimaram.unitfourteen;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EuckrEncoder implements TextStrategy{
    private static final Charset EUC_KR_CHARSET = Charset.forName("EUC-KR");

    @Override
    public String textEncoding(String text) {
        byte[] euckrBytes = text.getBytes(EUC_KR_CHARSET);
        return new String(euckrBytes, StandardCharsets.ISO_8859_1);
    }
}
