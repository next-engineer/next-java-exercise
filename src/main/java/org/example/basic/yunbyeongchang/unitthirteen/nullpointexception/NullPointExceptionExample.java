package org.example.basic.yunbyeongchang.unitthirteen.nullpointexception;

public class NullPointExceptionExample {
    //var

    //method
    public static void main(String[] args) {
        String user = null;

        try {
            System.out.println("user's length: " + user.length());
        } catch(NullPointerException e) {
            System.out.println("NullPointException Alert!: " + e.getMessage());
        }

    }
}
