package org.example.basic.yunbyeongchang.uniteleven.homework.uibasedlist;

import java.util.*;

public class FruitList {
    //var
    List<String> fruits;

    //method
    public FruitList()  { fruits = new ArrayList<>(); }

    public void addFruit(String var)
    {
        if(var == null || var.isEmpty())
        {
            System.out.println("잘못된 입력입니다.");   return;
        }

        fruits.add(var);
        System.out.println(var + "를 추가했습니다.");
    }
    public void removeFruit(String var)
    {
        if(!fruits.contains(var))
        {
            System.out.println(var + "가 리스트에 존재하지 않습니다."); return;
        }

        fruits.remove(var);
        System.out.println(var + "를 제거했습니다.");
    }

    public void findFruitByIndex(int var)
    {
        try
        {
            String fruit = fruits.get(var);
            System.out.println(var + "번째 과일은 " + fruit + " 입니다.");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }

    public void findIndexByFruit(String var)
    {
        int index = fruits.indexOf(var);
        if(index != -1) System.out.println(var + "은 " + index + "번째 인덱스에 있습니다.");
        else System.out.println(var + "은 리스트에 존재하지 않습니다.");
    }

    public void printFruits()
    {
        if(fruits.isEmpty())
        {
            System.out.println("현재 리스트가 비어있습니다.");  return;
        }

        for(String fruit: fruits)
            System.out.println(fruits.indexOf(fruit) + "번째 과일: " + fruit);
    }
}
