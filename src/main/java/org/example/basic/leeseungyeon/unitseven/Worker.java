<<<<<<< HEAD
package main.java.org.example.basic.leeseungyeon.unitseven;
=======
package org.example.basic.leeseungyeon.unitseven;
>>>>>>> 5a75d72b88570db18af6ff9329710c6db5ba3097

public class Worker extends Person {
    String company;

    public Worker(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void work() {
        System.out.println(name + "은(는) " + company + "에서 일하고 있습니다.");
    }
}
