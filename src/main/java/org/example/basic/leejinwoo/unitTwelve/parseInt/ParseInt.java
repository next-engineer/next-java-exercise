package org.example.basic.leejinwoo.unitTwelve.parseInt;

public class ParseInt {
    public static void main(String[] args) {
        String str = "05";
//        String str = "0p"; //num format err
        parseInt(str);
    }

    public static void parseInt(String str){
        try {
            System.out.println("str : " + str);
            System.out.println("parse int : " + Integer.parseInt(str));
        }catch (NumberFormatException ne){
            System.out.println("number format err : " + ne);
        }catch (Exception e){
            System.out.println("err : " + e);
        }
    }
}
