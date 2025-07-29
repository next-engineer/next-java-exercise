package org.example.advaned.anheebin.unitien;

public enum ToppingType {
    PAPAL("papal",1000),
    CHEESE("cheese",1500),
    MEAT("meat",2000),
    VEGETABLE("vegetable",1000),
    SAUCE("sauce",500),
    TOPPING("topping",1000);

    private final String description;
    private final int price;

    ToppingType(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
} 