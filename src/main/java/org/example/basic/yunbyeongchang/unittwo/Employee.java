package org.example.basic.yunbyeongchang.unittwo;

public class Employee {
    //var
    private String name;            // 이름
    private double salary;          // 급여
    private String department;      // 부서

    //method
    public Employee(String name, double salary, String department)
    {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void changeDepartment(String newDepartment)      // 부서 이동(사실상 setter와 같음)
    {
        System.out.println(this.name + "님의 부서가 " + this.department + "에서 " +
                newDepartment + "로 변경됩니다.");
        this.department = newDepartment;
    }

    public void printEmployeeInfo()                         // 정보 출력(확인 용이를 위해 임의로 제작)
    {
        System.out.println("---------------------------------");
        System.out.println("이름: " + this.name);
        System.out.println("급여: " + this.salary);
        System.out.println("현재 부서: " + this.department);
        System.out.println("---------------------------------");
    }

    //getter setter
    public String getName() { return this.name; }
    public double getSalary() { return this.salary; }
    public String getDepartment() { return this.department; }

    public void setName(String name) { this.name = name; }
}
