package org.example.basic.gojunho.unitthree;

public class Customer {
    private String name;
    private String grade;
    private int point;

    public Customer(String name,String grade,int point){
        this.name=name;
        this.grade=grade;
        this.point=point;
    }
    public int calculateDiscountPrice(int price){
        if(grade=="GOLD"){
            price*=0.9;
            return price;
        }
        else if(grade=="SILVER"){
            price*=0.95;
            return price;
        }
        else if(grade=="BASIC"){
            return price;
        }
        return 0;
    }

    public void showCustomerInfo(){
        System.out.println("고객이름: "+name+" 등급: "+grade+" 포인트: "+point);
    }

    public void earnPoints(int price){
        point+= (int)(price*0.01);
        if(grade=="GOLD"){
            point+= (int)(price*0.02);
        }
        else if(grade=="SILVER"){
            point+= (int)(price*0.01);
        }
    }
}

