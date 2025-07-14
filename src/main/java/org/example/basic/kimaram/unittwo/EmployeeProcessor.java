package org.example.basic.kimaram.unittwo;

public class EmployeeProcessor {
    public static void main(String[] args) {
        Employee employee = new Employee("김개똥", 33423424, "개발");
        System.out.println("부서 이동 전 : "+ employee);

        employee.changeDepartment("영업");
        System.out.println("부서 이동 후 : "+ employee);
    }
}
