package org.example.basic.leeseungyeon.unittwo;

public class Employee {
    // 필드 모두 private
    private String name;
    private double salary;
    private String department;

    // 생성자
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter만 제공 (salary는 읽기만 가능)
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setter for salary 없음

    // 부서 변경은 이 메서드로만 가능
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            this.department = newDepartment;
            System.out.println("부서가 '" + newDepartment + "'(으)로 변경되었습니다.");
        } else {
            System.out.println("⚠️ 유효하지 않은 부서 이름입니다.");
        }
    }

    // 직원 정보 출력 메서드
    public void printEmployeeInfo() {
        System.out.println("👤 직원 정보");
        System.out.println("이름: " + name);
        System.out.println("급여: " + salary + "원");
        System.out.println("부서: " + department);
        System.out.println("------------------------");
    }
}
