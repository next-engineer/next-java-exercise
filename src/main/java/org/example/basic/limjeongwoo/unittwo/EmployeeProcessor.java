package org.example.basic.limjeongwoo.unittwo;

public class EmployeeProcessor {

    public static void main(String[] args) {
        Employee employee = new Employee("임정우", 5000000, "웹개발");

        System.out.println("이름: " + employee.getName() + ", 급여: " + employee.getSalary() + ", 부서: " + employee.getDepartment());

        employee.changeDepartment("모바일 개발");
        System.out.println("부서: " + employee.getDepartment());

    }
}
