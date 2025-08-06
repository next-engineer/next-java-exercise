package org.example.basic.bangjihyun.uniteightteen;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;

    public CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    public void printOrder() {
        System.out.println("주문하신 커피는 " + size + " 사이즈 " + type + "입니다.");
        System.out.println("용량: " + size.getMl() + "ml");
        int totalPrice = type.getPrice() + size.getExtraPrice();
        System.out.println("총 가격: " + totalPrice + "원");
    }
}
