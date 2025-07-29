package org.example.basic.parkgwanghoon.UnitTwelve;

public class PGChecker {
    public static void main(String[] args) {
        try {
            pgCheck(15);
        } catch (PGException e) {
            System.out.println("연령 제한: " + e.getMessage());
        }
    }
    public static void pgCheck(int age) throws PGException {
        if (age < 19) {
            throw new PGException("미성년자는 이용이 불가합니다.");
        }
    }
}