package org.example.basic.leejinwoo.unitTwo;

public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(
            String name,
            double salary,
            String department
    ){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public static void main(String[] args){
        Employee employee = new Employee("leejinwoo", 1000, "marketing");
        EmployeeProcessor(employee);    // 부서변경
    }

    public static void EmployeeProcessor(Employee employee){
        changeDepartment("development", employee);

        System.out.println("name : " + employee.getName());
        System.out.println("salary : " + employee.getSalary());
        System.out.println("department : " + employee.getDepartment());
    }

    public static void changeDepartment(String newDepartment, Employee employee){  //부서변경
        employee.setDepartment(newDepartment);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getDepartment(){
        return this.department;
    }
}
