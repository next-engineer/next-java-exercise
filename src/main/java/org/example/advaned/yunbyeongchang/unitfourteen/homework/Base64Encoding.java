package org.example.advaned.yunbyeongchang.unitfourteen.homework;

import java.nio.charset.Charset;
import java.util.Base64;

public class Base64Encoding implements EncodingStrategy {
    //var

    //method
    @Override
    public byte[] encoding(String text) {
        byte[] bytes = text.getBytes();
        return Base64.getEncoder().encode(bytes);
    }
}
