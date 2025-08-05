package org.example.advaned.yunbyeongchang.unitfourteen.homework;


import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    //method
    public static void main(String[] args) {
        String input = "안녕하세요";

        List<EncoderContext> encoders = List.of(
                new EncoderContext(new Base64Encoding()),
                new EncoderContext(new HexEncoding()),
                new EncoderContext(new EUCKREncoding()),
                new EncoderContext(new UTF8Encoding())
        );

        for (EncoderContext encoder : encoders) {
            byte[] result = encoder.encode(input);
            String output = printByteToString(result);

            System.out.println(encoder.getStrategyName() + ": " + output);
        }
    }

    
    private static String printByteToString(byte[] bytes) {
        // 일반적으로 Base64나 텍스트라면 UTF-8로 변환 가능
        try {
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            // 변환 실패 시 HEX로 출력
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02X", b));
            }
            return sb.toString();
        }
    }

}
