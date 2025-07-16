package org.example.basic.taebinlee.unittwo;

public class Employee {

    //필드
    private String name;
    private double salary;
    private String department;


    // 메서드 생성자
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // getter
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }


    // setter
    public void setName(String name) {
        this.name = name;
    }


    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;

    }



}
