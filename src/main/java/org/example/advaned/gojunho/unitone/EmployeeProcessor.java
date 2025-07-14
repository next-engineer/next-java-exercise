package org.example.advaned.gojunho.unitone;

public class EmployeeProcessor {
    public static void main(String args[]){
        Employee employee = new Employee("고준호","개발자",500000);
        employee.Setter("고준호","엔지니어");
        System.out.println(employee.Getter());
        employee.changeDepartment("DevOps");
    }

}
