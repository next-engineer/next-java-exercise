package org.example.basic.mindongil.unittwo;

import java.util.Scanner;

public class EmployeeProcessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정보 입력
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        System.out.print("연봉 입력(단위 만): ");
        double salary = sc.nextDouble();
        sc.nextLine(); // ★ 엔터 제거용 (버퍼 비우기)
        System.out.print("부서 입력: ");
        String department = sc.nextLine();


        Employee employee = new Employee(name, salary, department);
        System.out.println();

        //정보 출력
        employee.printInfo();
        System.out.println();

        //부서 변경
        System.out.print("변경할 부서 명을 쓰시오. ");
        String newDepartment = sc.nextLine();
        employee.changeDepartment(newDepartment);
        //정보 출력
        System.out.println();
        employee.printInfo();

    }

}
