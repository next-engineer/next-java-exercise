package org.example.advaned.yunbyeongchang.unitfourteen.homework;

public class EncoderContext {
    //var
    private final EncodingStrategy strategy;

    //method
    public EncoderContext(EncodingStrategy strategy) {
        this.strategy = strategy;
    }

    public byte[] encode(String text) {
        if(strategy == null) {
            throw new IllegalStateException("정의되지 않은 방식입니다.");
        }

        return strategy.encoding(text);
    }

    public Class getStrategyName() {
        return strategy.getClass();
    }

}
