package org.example.basic.limjeongwoo.unittwo;

public class Employee {

    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void changeDepartment(String newDepartment){
        department = newDepartment;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setName(String name){
        this.name = name;
    }

}
