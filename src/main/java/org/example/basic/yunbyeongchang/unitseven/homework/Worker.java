package org.example.basic.yunbyeongchang.unitseven.homework;

public class Worker extends Person{
    //var
    private String company;

    //method
    public Worker(String name, int age, String company)
    {
        super(name, age);
        this.company = company;
    }

    public void printInfo()
    {
        super.printInfo();
        System.out.println("회사: " + this.company);
    }

    public String getCompany()
    {
        return this.company;
    }

    public void setCompany(String value)
    {
        this.company = value;
    }
}
