package org.example.basic.parkgwanghoon.UnitThirteen;

public class NpeExample {
    public static void main(String [] args) {
        String user = null;
        try {
            System.out.println("rlfdl: " + user.length());
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException 발생: " + e.getMessage());
        }
    }
}
