<<<<<<< HEAD
package main.java.org.example.basic.leeseungyeon.unitseven;
=======
package org.example.basic.leeseungyeon.unitseven;
>>>>>>> 5a75d72b88570db18af6ff9329710c6db5ba3097

public class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age); // 부모 생성자 호출
        this.school = school;
    }

    public void study() {
        System.out.println(name + "은(는) " + school + "에서 공부하고 있습니다.");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 5a75d72b88570db18af6ff9329710c6db5ba3097
