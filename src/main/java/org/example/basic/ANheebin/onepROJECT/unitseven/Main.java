package org.example.basic.ANheebin.onepROJECT.unitseven;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("지민", 20, "서울대학교");
        Worker w = new Worker("민수", 30, "카카오");
        
        s.printInfo();
        s.stat();

        System.out.println();

        w.printInfo(); 
        w.work();
    }
}
    
