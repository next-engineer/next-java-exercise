package org.example.basic.sangyoonlee.unittwo;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private final BigDecimal salary;
    private String department;

    public Employee(String name, BigDecimal salary, String department) {
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

    public BigDecimal getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println(newDepartment + "로 부서 변경");
        System.out.println();
    }
}
