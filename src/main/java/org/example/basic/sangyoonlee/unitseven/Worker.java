package org.example.basic.sangyoonlee.unitseven;

public class Worker extends Person {
    private final String company;

    public Worker(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void work() {
        System.out.println(getName() + "은(는) " + company + "에서 일하고 있습니다.");
    }
}
