package org.example.basic.gojunho.unitthree;

public class main {
    public static void main(String args[]){
        Customer customer = new Customer("고준호","GOLD",0);
        System.out.println("할인된 가격은 "+customer.calculateDiscountPrice(10000)+"원 입니다.");
        customer.earnPoints(10000);
        customer.showCustomerInfo();
    }
}
