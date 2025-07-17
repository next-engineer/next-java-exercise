package org.example.basic.sangyoonlee.unittwo;

import java.math.BigDecimal;

public class EmployeeProcessor {
    private static void printEmployeeInfo(Employee employee) {
        System.out.println("이름: " + employee.getName());
        System.out.println("연봉: " + employee.getSalary());
        System.out.println("부서: " + employee.getDepartment());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Elon Musk", new BigDecimal("2527567515.98"), "Tesla");

        printEmployeeInfo(employee);

        employee.changeDepartment("SpaceX");

        printEmployeeInfo(employee);
    }
}
