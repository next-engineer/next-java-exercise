package org.example.basic.parkgwanghoon.UnitThirteen;

public class SafeNullCheck {
    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println("Length: " + name.length());
        } else {
            System.out.println("Name is null!");
        }
    }
}
