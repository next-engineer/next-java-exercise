package org.example.basic.gojunho.uniteightteen;

public class CoffeeOrder {
    private CoffeeSize size;
    private CoffeeType type;

    public CoffeeOrder(CoffeeType type,CoffeeSize size){
        this.type=type;
        this.size=size;
    }

    public void printOrder(){
        if(type != null && size != null) {
            System.out.println("주문하신 커피는 " + size + " 사이즈 " + type + "입니다.");
            System.out.println("가격: " + type.getprice() + "원");
            System.out.println("용량: " + size.getMl() + "ml");
            System.out.println();
        }
        else{
            System.out.println("주문이 올바르지 않습니다.");
        }
    }
}
