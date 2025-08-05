package org.example.advaned.yunbyeongchang.unitfourteen.homework;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UTF8Encoding implements EncodingStrategy {
    //var

    //method
    @Override
    public byte[] encoding(String text) {
        return text.getBytes(StandardCharsets.UTF_8);
    }
}
