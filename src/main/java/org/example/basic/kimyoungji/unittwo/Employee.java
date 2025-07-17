package org.example.basic.kimyoungji.unittwo;

public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter만 제공
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // 부서만 변경 가능
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isBlank()) {
            this.department = newDepartment;
            System.out.println("부서가 " + newDepartment + "(으)로 변경되었습니다.");
        } else {
            System.out.println("유효하지 않은 부서명입니다.");
        }
    }

}