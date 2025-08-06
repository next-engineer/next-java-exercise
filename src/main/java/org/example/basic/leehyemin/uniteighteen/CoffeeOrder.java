package org.example.basic.leehyemin.uniteighteen;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;
    private CoffeeExtraPrice extraPrice;
    private int num;

    public CoffeeOrder(CoffeeType type, CoffeeSize size, CoffeeExtraPrice extraPrice, int num) {
        this.type = type;
        this.size = size;
        this.extraPrice = extraPrice;
        this.num = num;
    }

    public void printOrder() {
        System.out.println(num+"번째 주문하신 커피는 "+size+" 사이즈 "+type+"입니다.");
        //System.out.println(extraPrice.getExtraPrice());
        System.out.println("용량 : "+size.getMl()+"ml, 금액 : "+(type.getPrice()+ extraPrice.getExtraPrice())+"원");
    }
}
