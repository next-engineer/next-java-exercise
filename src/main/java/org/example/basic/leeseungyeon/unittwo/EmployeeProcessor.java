package org.example.basic.leeseungyeon.unittwo;

public class EmployeeProcessor {
    public static void main(String[] args) {
        // 객체 생성
        Employee emp = new Employee("이승연", 5000000, "개발팀");

        // 초기 정보 출력
        emp.printEmployeeInfo();

        // 부서 변경
        emp.changeDepartment("디자인팀");
        emp.printEmployeeInfo();

        // 잘못된 부서 입력 테스트
        emp.changeDepartment("");

        // salary는 수정할 수 없음
        // emp.salary = 9999999; // ← 오류 발생 (private + setter 없음)

        // salary는 읽기만 가능
        System.out.println("현재 급여: " + emp.getSalary() + "원");
    }
}
