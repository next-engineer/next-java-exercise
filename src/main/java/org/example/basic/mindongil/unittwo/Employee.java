package org.example.basic.mindongil.unittwo;

public class Employee {
    private String name;
    private double salary;
    private String department;

    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    //name set,get
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //salary get
    public double getSalary(double salary) {
        return salary;
    }

    //department set,get]
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    //부서변경
    public String changeDepartment(String department) {
        this.department = department;
        System.out.printf("%s 부서로 변경되었습니다.\n" , department);
        return department;
    }

    //정보 출력
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("연봉(단위 만): " + salary);
        System.out.println("부서: " + department);
    }

}
