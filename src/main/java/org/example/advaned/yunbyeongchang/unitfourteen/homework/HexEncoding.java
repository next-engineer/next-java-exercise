package org.example.advaned.yunbyeongchang.unitfourteen.homework;

import java.nio.charset.Charset;
import java.util.Base64;

public class HexEncoding implements EncodingStrategy {
    //var

    //method
    @Override
    public byte[] encoding(String text) {
        byte[] bytes = text.getBytes();
        StringBuilder stringbuilder = new StringBuilder();
        for(byte b: bytes) {
            stringbuilder.append(String.format("%02X", b));
        }

        return stringbuilder.toString().getBytes();
    }
}
