package org.example.advaned.parkgwanghoon.UnitOne;

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

    // Getter
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setter (salary는 없음)
    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}
