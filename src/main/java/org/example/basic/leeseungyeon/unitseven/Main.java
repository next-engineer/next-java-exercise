package main.java.org.example.basic.leeseungyeon.unitseven;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("짱구", 30, "떡잎대학교");
        Worker w = new Worker("철수", 30, "네이버");

        s.introduce(); // Person 클래스 메서드
        s.study();     // Student 클래스 메서드

        System.out.println();

        w.introduce(); // Person 클래스 메서드
        w.work();      // Worker 클래스 메서드
    }
}
