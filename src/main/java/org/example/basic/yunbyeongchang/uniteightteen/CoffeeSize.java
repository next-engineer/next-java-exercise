package org.example.basic.yunbyeongchang.uniteightteen;

public enum CoffeeSize {
    SMALL(250), MEDIUM(350), LARGE(450);

    private final int ml;

    CoffeeSize(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }
}
