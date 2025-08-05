package org.example.advaned.leehyemin.unitfourteen;

public class Encoder {
    private EncodingStrategy strategy;

    public void setStrategy(EncodingStrategy strategy) {
        this.strategy = strategy;
    }

    public String encode(String input) {
        return strategy.encode(input);
    }

    public String decode(String input) {
        return strategy.decode(input);
    }
}
