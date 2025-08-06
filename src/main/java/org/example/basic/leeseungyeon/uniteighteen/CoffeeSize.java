package org.example.basic.leeseungyeon.uniteighteen;

public enum CoffeeSize {
    SMALL("Small", 250, 0),
    MEDIUM("Medium", 350, 500),
    LARGE("Large", 450, 1000);

    private final String englishName;
    private final int ml;
    private final int extraPrice;

    CoffeeSize(String englishName, int ml, int extraPrice) {
        this.englishName = englishName;
        this.ml = ml;
        this.extraPrice = extraPrice;
    }

    public String getEnglishName() {
        return englishName;
    }

    public int getMl() {
        return ml;
    }

    public int getExtraPrice() {
        return extraPrice;
    }

    @Override
    public String toString() {
        String priceInfo = extraPrice > 0 ? " (+" + extraPrice + " won)" : "";
        return name() + " (" + englishName + ", " + ml + "ml)" + priceInfo;
    }

    public static CoffeeSize fromInput(String input) {
        try {
            return CoffeeSize.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid size. Choose from: SMALL, MEDIUM, LARGE.");
        }
    }
}

