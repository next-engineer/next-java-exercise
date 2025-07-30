package org.example.basic.leeseungyeon.uniteleven;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<String> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(name);
    }

    public boolean removeStudent(String name) {
        return students.remove(name);
    }

    public String getStudent(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }

    public void printAllStudents() {
        System.out.print("전체 학생: [");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i));
            if (i != students.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();

        // 학생 5명 추가
        list.addStudent("Alice");
        list.addStudent("Bob");
        list.addStudent("Charlie");
        list.addStudent("David");
        list.addStudent("Eve");

        // Charlie 삭제
        list.removeStudent("Charlie");

        // 전체 학생 목록 출력
        list.printAllStudents();

        // 인덱스 1번 학생 출력
        String student = list.getStudent(1);
        if (student != null) {
            System.out.println("인덱스 1번 학생: " + student);
        } else {
            System.out.println("해당 인덱스에 학생이 없습니다.");
        }
    }
}
