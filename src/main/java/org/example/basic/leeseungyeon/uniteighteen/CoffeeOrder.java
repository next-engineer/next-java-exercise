package org.example.basic.leeseungyeon.uniteighteen;

public record CoffeeOrder(CoffeeType type, CoffeeSize size) {

    public int getTotalPrice() {
        return type.getBasePrice() + size.getExtraPrice();
    }

    public void printDetails() {
        System.out.println("\n=== Order Details ===");
        System.out.println("Coffee: " + type.getEnglishName());
        System.out.println("Size: " + size.getEnglishName() + " (" + size.getMl() + "ml)");
        System.out.println("Price: " + getTotalPrice() + " won");
        System.out.println("=====================");
    }

    public String getSummaryLine() {
        return type.getEnglishName() + " (" + size.getEnglishName() + ") - " + getTotalPrice() + " won";
    }
}
