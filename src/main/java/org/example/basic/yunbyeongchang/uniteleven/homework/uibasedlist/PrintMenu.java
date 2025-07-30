package org.example.basic.yunbyeongchang.uniteleven.homework.uibasedlist;

import java.util.Scanner;

public class PrintMenu {
    //var
    private Scanner sc;
    private FruitList fruitList;

    //method
    public PrintMenu()
    {
        sc = new Scanner(System.in);
        fruitList = new FruitList();
    }

    public void selectMenu()
    {
        System.out.println("---------------------");
        System.out.println("원하시는 메뉴를 선택해 주세요.");
        System.out.println("1: 과일 항목 추가");
        System.out.println("2: 과일 삭제");
        System.out.println("3: 인덱스 기반 과일 찾기");
        System.out.println("4: 과일 기반 인덱스 찾기");
        System.out.println("5: 전체 과일 출력");
        System.out.println("6: 종료");
        System.out.println("---------------------");

        actionMenu(sc.nextInt());
    }

    public void actionMenu(int inputNum)
    {
        switch(inputNum)
        {
            case 1:     //과일 추가
                add();
                break;
            case 2:     //과일 삭제
                remove();
                break;
            case 3:     //인덱스 기반 과일 찾기
                findFruit();
                break;
            case 4:     //과일 기반 인덱스 찾기
                findIndex();
                break;
            case 5:     //전체 과일 출력
                fruitList.printFruits();
                break;
            case 6:     //종료
                System.out.println("시스템을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    private void add()
    {
        System.out.print("추가할 과일의 이름을 입력해주세요.: ");
        String fruit = sc.next();

        fruitList.addFruit(fruit);

    }

    private void remove()
    {
        System.out.print("제거할 과일의 이름을 입력해주세요.: ");
        String fruit = sc.next();

        fruitList.removeFruit(fruit);
    }

    private void findFruit()
    {
        System.out.print("탐색할 과일의 인덱스를 입력해주세요.: ");
        int index = sc.nextInt();

        fruitList.findFruitByIndex(index);
    }

    private void findIndex()
    {
        System.out.print("인덱스에 속한 과일의 이름을 입력해주세요.: ");
        String fruit = sc.next();

        fruitList.findIndexByFruit(fruit);
    }





}
