package org.example.basic.kimyoungji.unitthirteen;

public class NpeExample {
    public static void main(String[] args) {
        String user = null;

        try {
            System.out.println("길이: " + user.length());
        } catch (NullPointerException e) {
            System.out.println("❗ NullPointerException 발생: " + e.getMessage());
        }
    }
}
