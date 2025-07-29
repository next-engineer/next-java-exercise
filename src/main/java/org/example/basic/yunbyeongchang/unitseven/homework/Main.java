package org.example.basic.yunbyeongchang.unitseven.homework;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        Student student = new Student("학생", 18, "구름고등학교");
        Worker worker = new Worker("직원", 31, "구름회사");

        student.printInfo();
        student.printSchool();

        worker.printInfo();
    }

}
