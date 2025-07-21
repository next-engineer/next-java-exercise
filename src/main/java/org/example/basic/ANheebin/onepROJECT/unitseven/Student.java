package org.example.basic.ANheebin.onepROJECT.unitseven;

public class Student extends Person {
    String shool;

    public Student(String name, int age, String shool) {
        super(name, age);
        this.shool = shool;
    }
    

    public void stat(){
        System.out.println(name+"은"+shool+"에서 공부하고 있습니다");
    }
}
