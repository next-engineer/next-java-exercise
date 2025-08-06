package org.example.basic.yunbyeongchang.uniteightteen;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;

    public CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    public void printOrder() {
        double priceResult = getPriceResult(type.getPrice(), size.getPriceMultiplier());

        System.out.println("주문하신 커피는 " + size + " 사이즈 " + type + "입니다.");
        System.out.println("용량: " + size.getMl() + "ml");
        System.out.println("가격: " + priceResult + "KRW");
    }

    public double getPriceResult(double price, double priceMultiplier) {
        return price * priceMultiplier;
    }
}
