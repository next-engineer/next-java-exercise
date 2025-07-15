package org.example.advaned.kimdonghyun.unitone;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee emp = new Employee("toryong", 100000, "Dev");

        System.out.println("이름: " + emp.getName());
        System.out.println("연봉: " + emp.getSalary());
        System.out.println("부서: " + emp.getDepartment());

        // 부서 변경
        emp.changeDepartment("마케팅부");

        System.out.println("\n[부서 변경 후]");
        System.out.println("부서: " + emp.getDepartment());

        // emp.salary = 7000000;  ← 이렇게는 변경 불가! 캡슐화 성공
    }
}
