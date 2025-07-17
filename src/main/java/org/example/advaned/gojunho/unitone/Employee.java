package org.example.advaned.gojunho.unitone;

public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name,String department,double salary){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }


    public String Getter(){
        return "이름:"+name+" 부서: "+department+" 월급: "+salary ;
    }


    public void Setter(String newname,String newdepartment){
        name=newname;
        department=newdepartment;
    }

    public void changeDepartment(String newDepartment){
        department=newDepartment;
        System.out.println("변경된 부서는 "+department+"입니다.");
    }
}
