package org.example.advaned.parkgwanghoon.UnitOne;

public class EmployeeProcessor {
    public static void main(String[] args) {
        // 객체 생성
        Employee emp = new Employee("홍길동", 5000000, "인사팀");

        // 정보 출력
        System.out.println("이름: " + emp.getName());
        System.out.println("급여: " + emp.getSalary());
        System.out.println("부서: " + emp.getDepartment());

        // 부서 변경
        emp.changeDepartment("개발팀");

        // 변경 후 출력
        System.out.println("\n[부서 변경 후]");
        System.out.println("부서: " + emp.getDepartment());

        // 급여를 바꾸려는 시도는 막혀 있음
        // emp.setSalary(6000000); ← 존재하지 않기 때문에 컴파일 에러
    }
}
