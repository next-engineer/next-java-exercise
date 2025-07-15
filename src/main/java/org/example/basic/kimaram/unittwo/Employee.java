package org.example.basic.kimaram.unittwo;

public class Employee {
    private String name;
    private double salary;
    private String department;

    // 생성자
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // 부서 변경 메소드
    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("%s,%f,%s",this.getName(),this.getSalary(),this.getDepartment());
    }

}
