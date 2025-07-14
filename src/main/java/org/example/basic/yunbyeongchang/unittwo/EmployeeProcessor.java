package org.example.basic.yunbyeongchang.unittwo;

public class EmployeeProcessor {

    public static void main(String[] args)
    {
        Employee employee = new Employee("윤병창", 1000000, "게임 프로그래머");

        employee.printEmployeeInfo();

        employee.changeDepartment("클라우드 매니저");

        employee.printEmployeeInfo();

    }
}
