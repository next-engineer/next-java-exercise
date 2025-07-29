package org.example.basic.yunbyeongchang.unitfour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    //var
    private Scanner sc;
    private ArrayList<Student> students;
    private StudentPrint studentPrint;

    //method
    public Menu() {
        students = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void selectMenu()
    {
        System.out.println("---------------------");
        System.out.println("원하시는 메뉴를 선택해 주세요.");
        System.out.println("1: 학생 정보 추가");
        System.out.println("2: 학생 리스트 출력");
        System.out.println("3: 일정 점수 이상 학생 출력");
        System.out.println("4: 점수 순서대로 정렬해서 출력");
        System.out.println("5: 종료");
        System.out.println("---------------------");

        actionMenu(sc.nextInt());
    }

    public void actionMenu(int num)
    {
        switch(num)
        {
            case 1:
                addStudent();
                break;
            case 2:
                studentPrint = new StudentListPrint();
                studentPrint.print(students);
                break;
            case 3:
                studentPrint = new ScoreFilterPrint();
                studentPrint.print(students);
                break;
            case 4:
                studentPrint = new SortPrint();
                studentPrint.print(students);
                break;
            case 5:
                System.out.println("시스템을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    public void addStudent() {
        System.out.print("학생의 이름을 입력해주세요.: ");
        String name = sc.next();

        System.out.print("학생의 점수를 입력해주세요.: ");
        int score = sc.nextInt();

        this.students.add(new Student(name, score));
    }

}
