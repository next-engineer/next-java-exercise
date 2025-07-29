package org.example.basic.yunbyeongchang.unitseven.homework;

public class Person {
    //var
    protected String name;
    protected int age;

    //method
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void printInfo()
    {
        System.out.println("----------------------");
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public void setAge(int value)
    {
        this.age = value;
    }

}
