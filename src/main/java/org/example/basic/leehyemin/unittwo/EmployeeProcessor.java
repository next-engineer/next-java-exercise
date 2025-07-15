package org.example.basic.leehyemin.unittwo;

public class EmployeeProcessor {
    public static void main(String[] args) {
        Employee employee=new Employee("이혜민", 4000, "개발부");

        employee.changeDepartment("환경안전부");
    }
}
