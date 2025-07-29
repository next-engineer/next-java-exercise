package org.example.basic.yunbyeongchang.unitseven.homework;

public class Student extends Person{
    //var
    private String school;

    //method
    public Student(String name, int age, String school)
    {
        super(name, age);
        this.school = school;
    }

    public void printInfo()
    {
        super.printInfo();
        System.out.println("학교: " + this.school);
    }

    public void printSchool()                       // 고유 메서드 출력 기능 확인용
    {
        System.out.println(super.getName() + "의 학교: " + this.school);
    }

    public String getSchool()
    {
        return this.school;
    }

    public void setSchool(String value)
    {
        this.school = value;
    }

}
