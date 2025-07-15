package org.example.basic.leejinwoo.unitThree;

public class Customer {
    private String name;
    private String grade;
    private int point;

    public Customer(
            String name,
            String grade,
            int point
    ){
        this.name = name;
        this.grade = grade;
        this.point = point;
    }


    public int calculateDiscountPrice(int price){
        int result = 0;

        if(grade.equals("BASIC")){
            result = price;
        } else if (grade.equals("SILVER")) {
            earnPoints(price);
            result = (int) (price - price * 0.05);
        }else{
            earnPoints(price);
            result = (int) (price - price * 0.1);
        }

        return result;
    }

    public void showCustomerInfo(){
        System.out.println("name : " + name);
        System.out.println("grade : " + grade);
        System.out.println("point : " + point);
    }

    public void earnPoints(int price){
        if(grade.equals("GOLD")){
            point = (int) (price * 0.02);
        } else {
            point = (int) (price * 0.01);
        }
    }

}
