<<<<<<< HEAD
package org.example.basic.mindongil.unitthree;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer("민동일", "silver", 100);

        int price = 10000;

        //가격 할인
        int discountedPrice = c1.calculateDiscountPrice(price);
        System.out.println("할인된 가격: " + discountedPrice);

        //포인트 적립
        c1.earnPoints(discountedPrice);
        //정보 출력
        c1.showCustomerInfo();
    }

}
=======
package org.example.basic.mindongil.unitthree;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer("민동일", "silver", 100);

        int price = 10000;

        //가격 할인
        int discountedPrice = c1.calculateDiscountPrice(price);
        System.out.println("할인된 가격: " + discountedPrice);

        //포인트 적립
        c1.earnPoints(discountedPrice);
        //정보 출력
        c1.showCustomerInfo();
    }

}
>>>>>>> 67826107d0f9d9f449ee2a4c52588c9452a0bf5f
