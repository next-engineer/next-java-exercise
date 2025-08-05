package org.example.advaned.sangyoonlee.unitfourteen.encoding;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoding {
    public static void main(String[] args) throws Exception {
        String input = "안녕하세요";

        byte[] utf8Bytes = input.getBytes(StandardCharsets.UTF_8);
        System.out.println("UTF-8 (Hex): " + bytesToHex(utf8Bytes));

        byte[] eucKrBytes = input.getBytes(Charset.forName("EUC-KR"));
        System.out.println("EUC-KR (Hex): " + bytesToHex(eucKrBytes));

        String base64Encoded = Base64.getEncoder().encodeToString(utf8Bytes);
        System.out.println("Base64 (from UTF-8): " + base64Encoded);

        System.out.println("Hex (from UTF-8): " + bytesToHex(utf8Bytes));
    }


    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString().trim();
    }
}
