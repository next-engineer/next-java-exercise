package org.example.basic.leeseungyeon.uniteighteen;

public enum CoffeeType {
    AMERICANO("Americano", 3000),
    LATTE("Latte", 4000),
    CAPPUCCINO("Cappuccino", 4500);

    private final String englishName;
    private final int basePrice;

    CoffeeType(String englishName, int basePrice) {
        this.englishName = englishName;
        this.basePrice = basePrice;
    }

    public String getEnglishName() {
        return englishName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return name() + " (" + englishName + ") - " + basePrice + " won";
    }

    public static CoffeeType fromInput(String input) {
        try {
            return CoffeeType.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid coffee type. Choose from: AMERICANO, LATTE, CAPPUCCINO.");
        }
    }
}
