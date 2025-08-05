package org.example.advaned.yunbyeongchang.unitfourteen.homework;

import java.nio.charset.Charset;

public class EUCKREncoding implements EncodingStrategy{
    //var

    //method
    @Override
    public byte[] encoding(String text) {
        return text.getBytes(Charset.forName("EUC-KR"));
    }
}
