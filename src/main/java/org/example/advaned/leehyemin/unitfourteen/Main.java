package org.example.advaned.leehyemin.unitfourteen;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        String input = "Hello World";

        encoder.setStrategy(new Base64EncodingStrategy());
        String encodedBase64 = encoder.encode(input);
        System.out.println("Base64 Encoded: " + encodedBase64);
        System.out.println("Base64 Decoded: " + encoder.decode(encodedBase64));

        encoder.setStrategy(new HexEncodingStrategy());
        String encodedHex = encoder.encode(input);
        System.out.println("Hex Encoded: " + encodedHex);
        System.out.println("Hex Decoded: " + encoder.decode(encodedHex));

        encoder.setStrategy(new UTF8EncodingStrategy());
        System.out.println("UTF8 Encoded: " + encoder.encode(input));

        encoder.setStrategy(new EUCKREncodingStrategy());
        System.out.println("EUC-KR Encoded: " + encoder.encode(input));
    }
}
