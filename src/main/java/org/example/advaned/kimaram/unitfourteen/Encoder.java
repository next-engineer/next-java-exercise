package org.example.advaned.kimaram.unitfourteen;

import java.util.HashMap;
import java.util.Map;

public class Encoder {
    private static final Map<String, TextStrategy> strategies = new HashMap<>();

    static {
        strategies.put("base64", new Base64Encoder());
        strategies.put("euc-kr", new EuckrEncoder());
        strategies.put("utf-8", new UTF8Encoder());
        strategies.put("hex", new HexEncoder());
    }

    public String encode(String strategyName, String text) {
        TextStrategy strategy = strategies.get(strategyName);
        if(strategy == null) {
            throw new IllegalArgumentException("지원하지 않는 인코딩입니다.");
        }
        return strategy.textEncoding(text);
    }
}
