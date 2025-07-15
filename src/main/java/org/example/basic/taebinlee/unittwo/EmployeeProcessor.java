package org.example.basic.taebinlee.unittwo;

public class EmployeeProcessor {

    public static void main(String[] args) {

        Employee emp = new Employee("이태빈",50000,"Sales");


        // 받은 정보 출력
        System.out.println("이름: "+ emp.getName());
        System.out.println("연봉($): " + emp.getSalary());
        System.out.println("소속부서: "+ emp.getDepartment());


        // 부서를 변경하는 경우
        emp.changeDepartment("AI팀");

        System.out.println();
        // 변경된 경우 정보 출력
        System.out.println("이름: "+ emp.getName());
        System.out.println("연봉($): " + emp.getSalary());
        System.out.println("소속부서: "+ emp.getDepartment());
    }

}

