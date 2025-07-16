package org.example.basic.leehyemin.unittwo;

public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    //부서 변경 메소드
    public void changeDepartment(String department) {
        this.department = department;
        System.out.println(getName()+"님의 부서가 "+department+"(으)로 변경되었습니다.");
    }
}
