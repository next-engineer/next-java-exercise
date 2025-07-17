package org.example.basic.ANheebin.onepROJECT.unittwo;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeDepartment(String newdepartment) {
        if (newdepartment != null && !newdepartment.isEmpty()){
            System.out.println("부서가 "+ department + "에서" + newdepartment + "로 변경됬습니다");
            this.department = newdepartment;
        }else{
            System.out.println("부서 변경 실패: 유효하지 않은 부서명");
        }
    }

        public static void main(String[] args){

        Employee emp = new Employee("김갑수", "개발부", 5000000);

        System.out.println("이름: " + emp.getName());
        System.out.println("부서: " + emp.getDepartment());
        System.out.println("급여: " + emp.getSalary());

        System.out.println("\n[부서 변경 ]");
        emp.changeDepartment("마케팅부");

        System.out.println("\n[급여 인상 테스트]");
        System.out.println("이름: " + emp.getName());
        System.out.println("급여: " + emp.getSalary());
        System.out.println("부서: " + emp.getDepartment());

    }

}
