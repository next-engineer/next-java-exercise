package org.example.basic.kimyoungji.unitone;

public class EmployeeProcessor {
    public static void main(String[] args) {
        Employee emp = new Employee("박지민", 5500000, "개발팀");

        System.out.println("이름: " + emp.getName());
        System.out.println("부서: " + emp.getDepartment());
        System.out.println("급여: " + emp.getSalary());

        emp.changeDepartment("기획팀");
        System.out.println("변경된 부서: " + emp.getDepartment());

    }
}
