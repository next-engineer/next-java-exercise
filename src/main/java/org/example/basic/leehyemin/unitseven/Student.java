package org.example.basic.leehyemin.unitseven;

public class Student extends Person {
    String school;


    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void study() {
        System.out.println(name+"은(는) "+school+"에서 공부하고 있습니다.");
    }
}
